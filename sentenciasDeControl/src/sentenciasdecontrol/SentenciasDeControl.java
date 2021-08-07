package sentenciasdecontrol;
import java.util.Scanner;
/**
 *
 * @author William Mendoza
 */
public class SentenciasDeControl {
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        var condicion = true;
        
        if(condicion){
            System.out.println("Condicion verdadera");
        }else{
            System.out.println("Condicion falsa");
        }
        */
        
        /*
        var numero = 2;
        var numeroTexto = "Numero desconocido";
        System.out.println("numeroTexto = " + numeroTexto);        
        
        if(numero == 1){
            numeroTexto = "Numero uno";
        }else if(numero == 2){
            numeroTexto = "Numero dos";            
        }else if (numero == 3){
            numeroTexto = "Numero tres";
        }else if(numero == 4){
            numeroTexto = "Numero cuatro";
        }else{
            numeroTexto = "Numero no encontrado";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
        */
        /*
        var consola = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes:");        
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";
        
        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "winter";
        }else if(mes == 3 || mes == 4 || mes == 5){
            estacion = "spring";
        }else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "summer";
        }else if (mes == 9 || mes == 10 || mes == 11){
            estacion = "fall";
        }else{
            System.out.println("El mes no existe.");
        }
        
        System.out.println("estacion: "+ estacion);
        */
        /*
        sentencia Switch con Java
        */
        /*
        var numero = 2;
        var numeroTexto = "Valor desconocido";
        
        switch(numero){
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero Tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
            default:
                numeroTexto = "Caso no encontrado";
        }
        
        System.out.println("Numero final: " + numeroTexto);
        */
        
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserte un numero de mes:");
        var mes = Integer.parseInt(scan.nextLine());
        var estacion = "Estacion desconocida";
        
        switch(mes){
            case 1: case 2: case 12:
                estacion = "Winter";
                break;
            case 3: case 4: case 5:
                estacion = "Spring";
                break;
            case 6: case 7: case 8:
                estacion = "summer";
            case 9: case 10: case 11:
                estacion = "fall";
                break;
            default:
                estacion = "Estacion desconocida";
        }
        
        System.out.println("Estacion : " + estacion);
        */
        
        /*
        Sistema de calificaciones
        */
        
        var consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        var calificacion = Integer.parseInt(consola.nextLine());
        
        if(calificacion >= 9 && calificacion <= 10){
            System.out.println("A");
        }else if(calificacion >= 8 && calificacion < 9){
            System.out.println("B");
        }else if(calificacion >= 7 && calificacion < 8){
            System.out.println("C");
        }else if(calificacion >= 6 && calificacion < 7){
            System.out.println("D");
        }else if(calificacion >= 0 && calificacion < 6){
            System.out.println("F");
        }else{
            System.out.println("Valor desconocido");
        }
        
        
    }
    
}
