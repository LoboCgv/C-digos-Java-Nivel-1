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
public class Cliente {
    private String rut,nombreCliente;
    private char sexo;//'F feminino' M maculinbhgdda
    private int edad;
    private String tipoCliente;
    private int descuento;

    public Cliente() {
    }

    public Cliente(String rut, String nombreCliente, char sexo, int edad, String tipoCliente) {
        this.rut = rut;
        this.nombreCliente = nombreCliente;
        this.sexo = sexo;
        this.edad = edad;
        this.tipoCliente = tipoCliente;
        /*Falta codigo*/
        this.descuento=setDescuento();
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getDescuento() {
        return descuento;
    }

    
    /*Determinar descuento*/

    private int setDescuento(){
        int resultado=0;//Cliente normal
        if(this.tipoCliente.compareTo("Tercera Edad")==0) resultado=40;
        else{
            if(this.tipoCliente.compareTo("Estudiante")==0)resultado=50; 
        }
        return resultado;
    }
}
