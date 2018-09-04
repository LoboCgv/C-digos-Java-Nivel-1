
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Main
{
    // instance variables - replace the example below with your own
   public static void main(String [] argv)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String entrada;
    boolean flag=false;
    while(!flag){
        System.out.println("Ingrese un rut válido maximo 15 caracteres");
        entrada=br.readLine();
        if(entrada.length()<=15) flag=true;
    }
    
    //Nombre no debe ser vacio y debe estar en mayuscula
    String nombreCompleto="";
    while(nombreCompleto.compareTo("")==0){
        System.out.println("Ingrese un nombre");
        nombreCompleto=br.readLine();
    }
    nombreCompleto=nombreCompleto.toUpperCase();
    System.out.println(nombreCompleto);
    
    char digito='N';
    while((digito!='6')&&(digito!='7')&&(digito!='8')&&(digito!='9')){
        entrada=br.readLine();
        digito=entrada.charAt(0);
    }
    
}

}
