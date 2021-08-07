
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("William", 2000, false);
//        System.out.println("nombre inicial= " + persona1.getNombre());
//        persona1.setNombre("William Armando");
//        System.out.println("nombre modificado= " + persona1.getNombre());
        System.out.println(persona1);
    }
}
