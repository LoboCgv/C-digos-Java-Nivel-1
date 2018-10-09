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
public abstract class PlanIsapre implements ICalculate{
    /*rutAfiliado (considere 8 dígitos)
    , nombreAfiliado (largo mínimo 5 caracteres),
    apellidoAfiliado (largo mínimo 5 caracteres),
    edadAfiliado (mayor a 17 años),
    sueldoAfiliado (mayor o igual a $257500),
    nombreNombrePlan,
    planActivo (Si está o no activo)*/
    private String rutAfiliado,nombreAfiliado,nombrePlan,apellidoAfiliado;
    private int edadAfiliado,sueldoAfiliado;
    private boolean planActivo;

    public PlanIsapre() {
    }

    public PlanIsapre(String rutAfiliado, String nombreAfiliado, String nombrePlan, String apellidoAfiliado, int edadAfiliado, int sueldoAfiliado) {
        this.rutAfiliado = rutAfiliado;
        this.nombreAfiliado = nombreAfiliado;
        this.nombrePlan = nombrePlan;
        this.apellidoAfiliado = apellidoAfiliado;
        this.edadAfiliado = edadAfiliado;
        this.sueldoAfiliado = sueldoAfiliado;
        this.planActivo=true;
    }

    public String getRutAfiliado() {
        return rutAfiliado;
    }

    public void setRutAfiliado(String rutAfiliado) {
        this.rutAfiliado = rutAfiliado;
    }

    public String getNombreAfiliado() {
        return nombreAfiliado;
    }

    public void setNombreAfiliado(String nombreAfiliado) {
        this.nombreAfiliado = nombreAfiliado;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public String getApellidoAfiliado() {
        return apellidoAfiliado;
    }

    public void setApellidoAfiliado(String apellidoAfiliado) {
        this.apellidoAfiliado = apellidoAfiliado;
    }

    public int getEdadAfiliado() {
        return edadAfiliado;
    }

    public void setEdadAfiliado(int edadAfiliado) {
        this.edadAfiliado = edadAfiliado;
    }

    public int getSueldoAfiliado() {
        return sueldoAfiliado;
    }

    public void setSueldoAfiliado(int sueldoAfiliado) {
        this.sueldoAfiliado = sueldoAfiliado;
    }

    public boolean isPlanActivo() {
        return planActivo;
    }

    public void setPlanActivo(boolean planActivo) {
        this.planActivo = planActivo;
    }
    @Override
    public double calcularPlan(){
        double resultado=(this.getSueldoAfiliado()*0.07)+this.valorPlan;
        return resultado;
    }
    
    public abstract double mostrarNuevoMonto();
    public abstract void mostrarNombrePlan();
    
}
