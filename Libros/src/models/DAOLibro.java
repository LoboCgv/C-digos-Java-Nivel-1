/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cetecom
 */
public class DAOLibro {
    Conexion con;

    public DAOLibro() {
        con=new Conexion();
    }
    public boolean estaLibro(String codigo){
        ResultSet rs = null;
        boolean flag = false;
        try {
            con = new Conexion();
            PreparedStatement stmt = null;
            String consulta = "Select * from libro where codigo=?";
            stmt = con.getConexion().prepareStatement(consulta);
            stmt.setString(1, codigo);
            
            rs = stmt.executeQuery();
            flag=rs.next();
            rs.close();
            stmt.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
                
        return flag;
    }
    public boolean agregarLibro(Libro l) throws SQLException{
        boolean flag=false;
        if(!this.estaLibro(l.getCodigo())){
            String consulta="insert into libro (codigo,nombre,formato,pagina,categoria,autor,nuevo) values (?,?,?,?,?,?,?)";
            PreparedStatement stmt= null;
            stmt = con.getConexion().prepareStatement(consulta);
            stmt.setString(1, l.getCodigo());
            stmt.setString(2, l.getNombre());
            stmt.setString(3, String.valueOf(l.getFormato()));
            System.out.println(l.getPagina());
            stmt.setInt(4, l.getPagina());
            stmt.setString(5,l.getCategoria());
            stmt.setString(6,l.getAutor());
            stmt.setBoolean(7, l.isNuevo());
            stmt.executeUpdate();
            flag=true;
        }
        return flag;
    }
}
