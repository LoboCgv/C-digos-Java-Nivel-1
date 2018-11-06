/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author cetecom
 */
public class DAOUsuario {

    private Conexion con;

    public DAOUsuario() {
        this.con = new Conexion();
    }

    protected boolean estaUsuario(Usuario user) {
        ResultSet rs = null;
        boolean flag = false;
        try {
            con = new Conexion();
            PreparedStatement stmt = null;
            String consulta = "Select * from usuarios where nombreUsuario=?";
            con = new Conexion();
            stmt = con.getConexion().prepareStatement(consulta);
            stmt.setString(1, user.getNombreUsuario());
            
            rs = stmt.executeQuery();
            flag=rs.next();
            rs.close();
            stmt.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
                
        return flag;
    }

    public boolean agregarUsuario(Usuario user) throws SQLException {
        boolean flag = false;
        PreparedStatement stmt = null;
        String consulta = "insert into usuarios (nombreUsuario,passwd,perfil) values (?,?,?)";
        if (!estaUsuario(user)) {
            try {
                con = new Conexion();
                stmt = con.getConexion().prepareStatement(consulta);
                stmt.setString(1, user.getNombreUsuario());
                stmt.setString(2, user.getPasswd());
                stmt.setString(3, user.getPerfil());
                stmt.executeUpdate();
                flag = true;
            } catch (SQLException se) {
                se.printStackTrace();
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
        return flag;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        ResultSet rs = null;
        ArrayList<Usuario> lista = new ArrayList();
        Usuario actual;
        try {
            con = new Conexion();
            Statement st = con.getConexion().createStatement();
            rs = st.executeQuery("Select * from usuarios");
            while (rs.next()) {
                actual = new Usuario(rs.getString("nombreUsuario"), rs.getString("passwd"), rs.getString("perfil"));
                lista.add(actual);
            }
            rs.close();
            st.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return lista;
    }

    public boolean validarUsuario(String nombreUsuario, String passwd) {
        ResultSet rs = null;
        boolean flag = false;
        try {
            
            PreparedStatement stmt = null;
            String consulta = "Select * from usuarios where nombreUsuario=? and passwd=?";
            //System.out.println(consulta);
            con = new Conexion();
            stmt = con.getConexion().prepareStatement(consulta);
            stmt.setString(1, nombreUsuario);
            stmt.setString(2,passwd);
            rs = stmt.executeQuery();
            flag=rs.next();
            rs.close();
            stmt.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
                
        return flag;
    }
    
    
    
}

