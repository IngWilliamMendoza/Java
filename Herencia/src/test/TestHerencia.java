package test;

import domain.Empleado;
import domain.Clientes;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("William", 1500);
        System.out.println("Empleado 1 = " + empleado1);
        
        Date fecha =  new Date(121, 01, 01);
        
        Clientes clientevip = new Clientes(fecha, true, "william", "m", 28, "calle falsa 123");
        System.out.println("clientevip = " + clientevip);
        
    }
}
