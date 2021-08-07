
package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        
        Persona william = new Persona();
        william.nombre = "william";
        william.apellido = "mendoza";
        william.desplegarInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        
    }
}
