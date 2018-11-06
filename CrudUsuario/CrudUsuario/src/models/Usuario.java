/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author cetecom
 */
public class Usuario{
    private String nombreUsuario;
    private String passwd;
    private String perfil;

    public Usuario(String nombreUsuario, String passwd, String perfil) {
        this.nombreUsuario = nombreUsuario;
        this.passwd = passwd;
        this.perfil = perfil;
    }

    

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario=" + nombreUsuario + ", passwd=" + passwd + ", perfil=" + perfil + '}';
    }
    
}
