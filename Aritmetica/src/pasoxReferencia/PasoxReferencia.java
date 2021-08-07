
package pasoxReferencia;

import clases.Persona;

public class PasoxReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("William");
        System.out.println(persona1.getNombre());
        persona1 = cambiarValor(persona1);
        
    }
    
    public static Persona cambiarValor(Persona persona){
        if(persona == null){
            return null;
        }
        
        persona.setNombre("Armando");
        return persona;
    }
}
