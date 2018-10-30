/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.Persona;

/**
 *
 * @author cetecom
 */
public class DAOPersona {
    protected Conexion con;

    public DAOPersona() {
        con = new Conexion();
    }

    //agregarCliente 
    public boolean agregarPersona(Persona p) throws SQLException {
        boolean flag = false;
        PreparedStatement stmt = null;
        String consulta = "insert into personas (nombrePersona,edadPersona) values (?,?)";
        try {
            con = new Conexion();
            stmt = con.getConexion().prepareStatement(consulta);
            stmt.setString(1, p.getNombrePersona());
            stmt.setInt(2, p.getEdad());
            stmt.executeUpdate();
            flag = true;
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
        return flag;
    }
    
    public ArrayList<Persona> listarCliente() {

        ResultSet rs = null;
        ArrayList<Persona> lista = new ArrayList();
        Persona actual;
        try {
            con = new Conexion();
            Statement st = con.getConexion().createStatement();
            rs = st.executeQuery("Select * from persona");
            while (rs.next()) {
                actual = new Persona(rs.getInt("codigoPersona"),rs.getInt("edadPersona"),rs.getString("nombrePersona"));
                lista.add(actual);
            }
            rs.close();
            st.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return lista;
    }
}
