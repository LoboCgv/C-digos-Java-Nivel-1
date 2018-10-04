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
public class AguaMineral extends Producto{
    private boolean gas;
    private int cc;

    public AguaMineral(boolean gas, int cc, String nombreProducto, int precioProducto) {
        super(nombreProducto, precioProducto);
        this.gas = gas;
        this.cc = cc;
    }
    
}
