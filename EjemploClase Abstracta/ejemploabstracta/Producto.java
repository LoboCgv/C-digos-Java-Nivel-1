/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploabstracta;

/**
 *
 * @author cetecom
 */
public abstract class Producto {
    private String nombreProducto;
    private int precioProducto;

    public Producto(String nombreProducto, int precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }
    public double getValorVenta(){
        return(this.precioProducto*1.19);
    }
    
}
