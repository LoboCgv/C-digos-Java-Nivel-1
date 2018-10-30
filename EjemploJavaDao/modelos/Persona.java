/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author cetecom
 */
public class Persona {
    private int codigoPersona,edad;
    private String nombrePersona;

    public Persona(int codigoPersona, int edad, String nombrePersona) {
        this.codigoPersona = codigoPersona;
        this.edad = edad;
        this.nombrePersona = nombrePersona;
    }

    public int getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(int codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombrePersona=" + nombrePersona + '}';
    }
    
    
}
