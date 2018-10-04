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
public class Cigarro extends Producto implements IManejador{
    private int nicotina;
    public Cigarro(String nombreProducto, int precioProducto) {
        super(nombreProducto, precioProducto);
    }

    @Override
    public double getValorFinal() {
        return(super.getValorVenta()*(100-descCigarro)/100);
    }
    
    
}
