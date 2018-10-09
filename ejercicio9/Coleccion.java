/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cetecom
 */
public class Coleccion {
    List<PlanIsapre> lista;

    public Coleccion() {
        lista=new ArrayList<PlanIsapre>();
    }
    
    public void addPlan(PlanIsapre pi){
        if(!esta(pi)) lista.add(pi);
    }
    
    protected boolean esta(PlanIsapre pi){
        boolean flag=true;
        PlanIsapre aux;
        int i=0;
        while(i<this.lista.size() && flag){
            aux=this.lista.get(i);
            if(aux.getRutAfiliado().compareTo(pi.getRutAfiliado())==0)flag=false;
            i++;
        }
        return flag;
    }
    
    public void mostrarPlanes(){
        PlanIsapre aux;
        int i=0;
        while(i<this.lista.size()){
            aux=this.lista.get(i);
            aux.mostrarNombrePlan();
            i++;
        }
    }
    
    public void listarPlanesSimple(){
        PlanIsapre aux;
        int i=0;
        while(i<this.lista.size()){
            aux=this.lista.get(i);
            if(aux.getClass().getSimpleName().compareTo("PlanSimple")==0) aux.mostrarNombrePlan();
            i++;
        }
    }
    
}
