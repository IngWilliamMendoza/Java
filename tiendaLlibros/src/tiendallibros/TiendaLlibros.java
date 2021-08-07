package tiendallibros;

import java.util.Scanner;

/**
 *
 * @author William Mendoza
 */
public class TiendaLlibros {

    public static void main(String[] args) {
        // TODO code application logic here
        
        var console = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        var nombre = console.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(console.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(console.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(console.nextLine());
        System.out.println(nombre + " #"+ id);
        System.out.println("Precio: " + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);        
    }
}
