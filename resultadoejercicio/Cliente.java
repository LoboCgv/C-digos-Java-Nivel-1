/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultadoejercicio;

/**
 *
 * @author cetecom
 */
public class Cliente {
    private String rutCliente, nombreCliente, correoElectronico;
    private char tipoCliente;

    public Cliente(String rutCliente, String nombreCliente, String correoElectronico, char tipoCliente) {
        this.rutCliente = rutCliente;
        this.nombreCliente = nombreCliente;
        this.correoElectronico = correoElectronico;
        this.tipoCliente = tipoCliente;
    }

    public Cliente() {
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rutCliente=" + rutCliente + ", nombreCliente=" + nombreCliente + ", correoElectronico=" + correoElectronico + ", tipoCliente=" + tipoCliente + '}';
    }
    
    
    
}
