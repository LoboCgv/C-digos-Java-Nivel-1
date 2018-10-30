/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobdjava;

import Daos.DAOPersona;
import java.sql.SQLException;
import modelos.Persona;

/**
 *
 * @author cetecom
 */
public class EjemploBDJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Persona p;
        DAOPersona dao;
        dao=new DAOPersona();
        p=new Persona(1,35,"Carlos");
        dao.agregarPersona(p);
        
    }
    
}
