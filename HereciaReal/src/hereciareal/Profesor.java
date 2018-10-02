/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hereciareal;

/**
 *
 * @author cetecom
 */
public class Profesor extends Persona{
    private String profesion;

    public Profesor(String profesion, String rut, String nombre, String direccion, String telefono) {
        super(rut, nombre, direccion, telefono);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "profesion=" + profesion + '}';
    }
    
}
