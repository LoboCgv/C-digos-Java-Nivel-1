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
public class HereciaReal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Medico m=new Medico(654214,"rut","Kaplan","fono","direccion");
        System.out.println(m.getNombre());
        
        Profesor p=new Profesor("Mg Astrofisica m f cuantica","150695929","carlos gonzalez","que les importa","996733571");
        System.out.println(p.toString());
        Cirujano c=new Cirujano(654214,"rut","Kaplan","fono","direccion");
        c.operar();
        Pediatra trastornado=new Pediatra(654214,"rut","Kaplan","fono","direccion");
        trastornado.envNeurologo();
        
        Medico []medicos=new Medico[10];
        medicos[0]=c;
        medicos[1]=trastornado;
    }
    
}
