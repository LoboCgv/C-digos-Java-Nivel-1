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
public class Plan {
    private String nomeroEquipo;
    private int cuotaNavegacion,minutosPlan,cargofijo,minutosUsados;

 
    private Cliente cli;

    public Plan(String nomeroEquipo, int cuotaNavegacion, int minutosPlan, int cargofijo, Cliente cli) {
        this.nomeroEquipo = nomeroEquipo;
        this.cuotaNavegacion = cuotaNavegacion;
        this.minutosPlan = minutosPlan;
        this.cargofijo = cargofijo;
        this.cli = cli;
    }

    public Plan() {
    }

    public String getNomeroEquipo() {
        return nomeroEquipo;
    }

    public void setNomeroEquipo(String nomeroEquipo) {
        this.nomeroEquipo = nomeroEquipo;
    }

    public int getCuotaNavegacion() {
        return cuotaNavegacion;
    }

    public void setCuotaNavegacion(int cuotaNavegacion) {
        this.cuotaNavegacion = cuotaNavegacion;
    }

    public int getMinutosPlan() {
        return minutosPlan;
    }

    public void setMinutosPlan(int minutosPlan) {
        this.minutosPlan = minutosPlan;
    }

    public int getCargofijo() {
        return cargofijo;
    }

    public void setCargofijo(int cargofijo) {
        this.cargofijo = cargofijo;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
    
    public int getMinutosUsados() {
        return minutosUsados;
    }

    public void setMinutosUsados(int minutosUsados) {
        this.minutosUsados = minutosUsados;
    }

    @Override
    public String toString() {
        return "Plan{" + "nomeroEquipo=" + nomeroEquipo + ", cuotaNavegacion=" + cuotaNavegacion + ", minutosPlan=" + minutosPlan + ", cargofijo=" + cargofijo + ", cli=" + cli + '}';
    }
    
    public void mostrarPlan(){
        System.out.println("*************************************");
        System.out.println(" Cliente: "+this.cli.getNombreCliente());
        System.out.println("Fono :" + this.nomeroEquipo);
        if(this.cli.getTipoCliente()=='P')
            System.out.println("Preferencial");
        else System.out.println("Normal");
    }
    
    public boolean validarNumeroCliente(String numeroEquipo,String nombreCliente){
        if((this.nomeroEquipo.compareTo(numeroEquipo)==0)&&(this.cli.getNombreCliente().compareTo(nombreCliente))==0) return true;
        else return false;
    }
    
    public int getMontoAdicional(){
        int resultado=0;
        if(this.minutosUsados>this.minutosPlan)resultado=150*(this.minutosUsados-this.minutosPlan);
        return resultado;
    }
    
    public int getMontoPagar(){
        return this.cargofijo+this.getMontoAdicional();
    }
    
    public void addMegas(int megas){
        this.setCuotaNavegacion(this.getCuotaNavegacion()+megas);
    }
}
