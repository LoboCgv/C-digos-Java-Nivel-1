/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

/**
 *
 * @author cetecom
 */
public class Cards {
    private int cant;
    private Tarjeta []data;

    public Cards() {
        this.cant=0;
        this.data=new Tarjeta[100];
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Tarjeta[] getData() {
        return data;
    }

    public void setData(Tarjeta[] data) {
        this.data = data;
    }
    /************************/
    
   public void mostrarData(){
       int i=0;
       while(i<this.getCant()){
           System.out.println(this.data[i].toString());
           i++;
       }
   }
   public boolean agregarTarjeta(Tarjeta nuevo){
       boolean flag=false;
       if(this.cant<100 && !this.estaTarjeta(nuevo.getCodigoTarjeta())){
           this.data[this.cant]=nuevo;
           this.cant++;
       }
       return flag;
   }
   
   public boolean estaTarjeta(int codigo){
       boolean flag=false;
       int i=0;
       while(i<this.cant && !flag){
           if(this.data[i].getCodigoTarjeta()==codigo)flag=true;
           i++;
       }
       return flag;
   }
}
