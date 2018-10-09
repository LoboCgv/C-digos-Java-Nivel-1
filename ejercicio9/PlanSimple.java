/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author cetecom
 */
public class PlanSimple extends PlanIsapre{
    private int descuento;
    public PlanSimple() {
        super();
        this.descuento=2;
    }

    public PlanSimple(String rutAfiliado, String nombreAfiliado, String nombrePlan, String apellidoAfiliado, int edadAfiliado, int sueldoAfiliado) {
        super(rutAfiliado, nombreAfiliado, nombrePlan, apellidoAfiliado, edadAfiliado, sueldoAfiliado);
        this.descuento=2;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    
    
    @Override
    public double mostrarNuevoMonto() {
        double resultado=this.calcularPlan()*((100-this.descuento)/100);
        return resultado;
    }

    @Override
    public void mostrarNombrePlan() {
        System.out.println("Nombre Plan: "+this.getNombrePlan());
    }

    @Override
    public void getTipoClase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
