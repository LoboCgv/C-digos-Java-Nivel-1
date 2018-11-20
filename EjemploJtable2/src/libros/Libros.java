/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

import java.sql.SQLException;
import models.DAOLibro;
import models.Libro;
import views.Main;

/**
 *
 * @author cetecom
 */
public class Libros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Main ventana=new Main();
        ventana.show();
    }
    
}
