/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import models.DAOUsuario;
import models.Usuario;

/**
 *
 * @author cetecom
 */
public class UsuarioController {

    private String accion;

    public UsuarioController() {
    }

    public UsuarioController(String accion) {
        this.accion = accion;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public void agregarUsuario(String nombreUsuario, String passwd, String perfil) throws SQLException {
        DAOUsuario dao = new DAOUsuario();
        Usuario user = new Usuario(nombreUsuario, passwd, perfil);
        if (dao.agregarUsuario(user)) {
            System.out.println("Usuario Agregado correctamente");
        } else {
            System.out.println("No se ha podido agregar");
        }
        desplegarUsuarios();
    }

    public void desplegarUsuarios() {
        DAOUsuario dao = new DAOUsuario();
        ArrayList<Usuario> lista = dao.getListaUsuarios();
        for (int x = 0; x < lista.size(); x++) {
            System.out.println(lista.get(x).toString());
        }
    }

    public void ejecutar() throws IOException, SQLException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
        switch (this.accion) {
            case "agregar":
                System.out.println("Ingrese nombre usaurio");
                String nombreUsuario = br.readLine();
                System.out.println("Ingrese password");
                String passwd = br.readLine();
                System.out.println("Ingrese perfil");
                String perfil = br.readLine();
                agregarUsuario(nombreUsuario, passwd, perfil);
                break;
            case "desplegar":
                desplegarUsuarios();
                break;
        }
    }

    public boolean validar() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
        System.out.println("Ingrese nombre usaurio");
        String nombreUsuario = br.readLine();
        System.out.println("Ingrese password");
        String passwd = br.readLine();
        DAOUsuario dao=new DAOUsuario();
        boolean flag= dao.validarUsuario(nombreUsuario,passwd);
       // System.out.println(flag);
        return flag;
    }
}
