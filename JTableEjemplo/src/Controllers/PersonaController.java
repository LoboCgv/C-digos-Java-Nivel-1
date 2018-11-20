/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Persona;
import java.util.ArrayList;

/**
 *
 * @author cetecom
 */
public class PersonaController {

    public PersonaController() {
    }
    
    public  ArrayList<Persona> getData(){
        ArrayList<Persona> lista=new ArrayList<Persona>();
        int i=0;
        while(i<10){
            lista.add(new Persona("nombre"+i,i,"codigo"+i));
            i++;
        }
        return lista;
    }
}
