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
public class PlanCarga extends PlanIsapre{
    private int numeroCargas;
    private double valorFactorPlan;

    public PlanCarga() {
    }

    public PlanCarga(int numeroCargas, String rutAfiliado, String nombreAfiliado, String nombrePlan, String apellidoAfiliado, int edadAfiliado, int sueldoAfiliado) {
        super(rutAfiliado, nombreAfiliado, nombrePlan, apellidoAfiliado, edadAfiliado, sueldoAfiliado);
        this.numeroCargas = numeroCargas;
        this.valorFactorPlan=this.getValorFactorPlan();
    }
    
    private double getValorFactorPlan(){
        double resultado=0;
        switch(this.numeroCargas){
            case 0:
                resultado=0;
            break;
            case 1:
                resultado=0.05;
            break;
            case 2:
                resultado=0.08;
            break;
            default:
                resultado=0.25;
            break;
        }
        return resultado;
    }

    public int getNumeroCargas() {
        return numeroCargas;
    }

    public void setNumeroCargas(int numeroCargas) {
        this.numeroCargas = numeroCargas;
    }
    
    @Override
    public double mostrarNuevoMonto() {
        if(this.numeroCargas==0)return this.getSueldoAfiliado();
        else return this.getSueldoAfiliado()*this.getNumeroCargas()*this.getValorFactorPlan();
    }

    @Override
    public void mostrarNombrePlan() {
        System.out.println(this.getNombrePlan());
        System.out.println(this.getNombreAfiliado());
        System.out.println(this.isPlanActivo());
        System.out.println(this.getNumeroCargas());
        System.out.println(this.mostrarNuevoMonto());
    }

    @Override
    public void getTipoClase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
