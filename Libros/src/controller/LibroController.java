/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import models.DAOLibro;
import models.Libro;

/**
 *
 * @author cetecom
 */
public class LibroController {
    private DAOLibro dao;

    public LibroController() {
        dao=new DAOLibro();
    }
    public boolean agregarLibro() throws SQLException{
        Libro l=new Libro("codigo3","nombre","categoria","autor",'T',false,10);
        return dao.agregarLibro(l);
    }
    public boolean agregarLibro(String codigo, String nombre, String categoria, String autor, char formato, boolean nuevo, int pagina) throws SQLException{
        
        Libro l=new Libro(codigo,nombre,categoria,autor,formato,nuevo,pagina);
        return dao.agregarLibro(l);
    }
}
