
import java.util.Scanner;
import javax.swing.JOptionPane;

//Mi clase en Java
public class HolaMundo {
    public static void main(String args[]){
        /*
        System.out.println("Hola Mundo desde Java");
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        String miVar = "william";
        System.out.println(miVar);
        miVar = "Adios";
        System.out.println(miVar);
        var william = "william" ;
        william = "mendoza";
        */
        /*
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scn.nextInt();
        System.out.println("La edad ingresada es: "+ edad);
        */
        //String nombre = JOptionPane.showInputDialog("ingrese su nombre");
        /*
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = num.nextInt();        
        if((numero>10)){
            System.out.println("El numero ingresado es mayor a 10");
        }else{
            System.out.println("El numero ingresado es menor de 10");
        }
        */
        /*
        System.out.print("Ingrese un numero: ");
        Scanner num = new Scanner(System.in);
        int numero = num.nextInt();
        if(numero%2 == 0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero ingresado es impar");
        }
        */
        /*
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N%2 != 0){
            System.out.println("Weird");
        } else if((N%2 == 0) && (2 <= N && 5 >= N)){
            System.out.println("Not Weird");
        } else if ((N%2 == 0) && (6 <= N && 20 >= N)){
            System.out.println("Weird");
        } else if (N%2 == 0 && 20 <= N ){
            System.out.println("Not Weird");
        }
        */
        /*
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String s = scan.next();
        Double d = scan.nextDouble();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        */
        /*
        var usuario = "William";
        var titulo = "Ingeniero";
        var union = titulo+" "+usuario;
        System.out.println("nombre usuario = " + union);
        */
        /*
        var nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador = \t" + nombre);
        System.out.println("Retroceso = \b" + nombre);
        */
        /*
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        String usuario = consola.nextLine();
        System.out.println("usuario: "+ usuario);
        */
        
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine(); 
        // Write your code here.
        System.out.println("String: " + s);
        System.out.println("Double: " + d);        
        System.out.println("Int: " + i);        
    }    
}
