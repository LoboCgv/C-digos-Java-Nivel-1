public class Viaje{
    private int numViaje;
    private String patente, destino;
    private boolean internacional;
    private Trabajador empleado;
    
    public Viaje(){}
    public Viaje (int numViaje, String patente, String detino, boolean internacional,
    Trabajador empleado){
        this.numViaje=numViaje;
        this.patente=patente;
        this.destino=destino;
        this.internacional=internacional;
        this.empleado=empleado;
    }
    //MUTADORES
    public void sedNumViaje(int numViaje){
        this.numViaje=numViaje;    
    }
    public void sedPatente(String patente){
        this.patente=patente;    
    }
    public void sedDestino(String destino){
        this.destino=destino;    
    }
    public void sedInternacional(boolean internacional){
        this.internacional=internacional;    
    }
    public void sedEmpleado(Trabajador empleado){
        this.empleado=empleado;    
    }
    //ACCESADORES
    public int getnumViaje (){
        return this.numViaje;
    }
    public String getpatente (){
        return this.patente;
    }
    public String getdestino (){
        return this.destino;
    }
    public boolean getinternacional (){
        return this.internacional;
    }
    public Trabajador getempleador (){
        return this.empleado;
    }
}