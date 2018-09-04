public class Trabajador{
    private String runTrabajador;
    private String nomcompletoTrabajador;
    private int telefonoTrabajador;
    private String diadescansoTrabajador;
    private double sueldoTrabajador;
    private String afpTrabajador;
    
    public Trabajador(String runTrabajador,String nomcompletoTrabajador,int telefonoTrabajador,
    String diadescansoTrabajador,double sueldoTrabajador,String afpTrabajador){
        this.runTrabajador=runTrabajador;
        this.nomcompletoTrabajador=nomcompletoTrabajador;
        this.telefonoTrabajador=telefonoTrabajador;
        this.diadescansoTrabajador=diadescansoTrabajador;
        this.sueldoTrabajador=sueldoTrabajador;
        this.afpTrabajador=afpTrabajador;
    }
    public Trabajador(){}
    //ACCESADORES
    public String getRunTrabajador (){
        return this.runTrabajador;
    }
    public String getNomCompletoTrabajador (){
        return this.nomcompletoTrabajador;
    }
    public int getTelefonoTrabajador (){
        return this.telefonoTrabajador;
    }
    public String getdiadescansoTrabajador (){
        return this.diadescansoTrabajador;
    }
    public double getSueldoTrabajador (){
        return this.sueldoTrabajador;
    }
    public String getAfpTrabajador (){
        return this.afpTrabajador;
    }
    //MUTADORES
    public void setRunTrabajador(String runTrabajador){
        this.runTrabajador=runTrabajador;
    }
    public void setNomCompletoTrabajador(String nomcompletoTrabajador){
        this.nomcompletoTrabajador=nomcompletoTrabajador;
    }
    public void setTelefonoTrabajador(int telefonoTrabajador){
        this.telefonoTrabajador=telefonoTrabajador;
    }
    public void setDiadescansoTrabajador(String diadescansoTrabajador){
        this.diadescansoTrabajador=diadescansoTrabajador;
    }
    public void setSueldoTrabajador(double sueldoTrabajador){
        this.sueldoTrabajador=sueldoTrabajador;
    }
    public void setAfpTrabajador(String afpTrabajador){
        this.afpTrabajador=afpTrabajador;
    }
}
