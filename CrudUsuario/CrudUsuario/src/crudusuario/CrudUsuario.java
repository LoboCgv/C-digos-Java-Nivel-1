/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudusuario;

import controllers.UsuarioController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/**
 *
 * @author cetecom
 */
public class CrudUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException {
        // TODO code application logic here
        UsuarioController userCont = new UsuarioController();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opt;
        //solicitar nombre de usuario y contraseña
        if (userCont.validar()) {
            do {
                System.out.println("1 para ingresar");
                opt = Integer.parseInt(br.readLine());
                if (opt == 1) {
                    userCont.setAccion("agregar");
                }
                userCont.ejecutar();
                userCont.setAccion("");
            } while (opt != 3);
        } else {
            //esc ribir usaurio hbasfkj
        }
    }

}
