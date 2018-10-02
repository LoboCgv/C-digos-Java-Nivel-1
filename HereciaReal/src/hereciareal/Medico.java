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
public class Medico extends Persona{
    private int rcm;

    public Medico(int rcm, String rut, String nombre, String direccion, String telefono) {
        super(rut, nombre, direccion, telefono);
        this.rcm = rcm;
    }

    public Medico() {
    }

    public int getRcm() {
        return rcm;
    }
    
    
    
}
