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
public class Pediatra extends Medico{

    public Pediatra(int rcm, String rut, String nombre, String direccion, String telefono) {
        super(rcm, rut, nombre, direccion, telefono);
    }
    
    public void envNeurologo(){}
}
