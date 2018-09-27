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
public class Tarjeta {
    private int codigoTarjeta;
    private double saldo;
    private Cliente client;
    private boolean estado;

    public Tarjeta() {
    }

    public Tarjeta(int codigoTarjeta, Cliente client) {
        this.codigoTarjeta = codigoTarjeta;
        this.client = client;
        this.saldo=0;
        this.estado=true;
    }

    public int getCodigoTarjeta() {
        return codigoTarjeta;
    }

    public void setCodigoTarjeta(int codigoTarjeta) {
        this.codigoTarjeta = codigoTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void cambioEstado(){
        this.estado=!this.estado;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "codigoTarjeta=" + codigoTarjeta + ", saldo=" + saldo + ", client=" + client + ", estado=" + estado + '}';
    }
    
    
}
