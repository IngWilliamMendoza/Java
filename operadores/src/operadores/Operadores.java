package operadores;

import java.util.Scanner;
/**
 *
 * @author William Mendoza
 */
public class Operadores {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        operadores aritmeticos
        */
        
        /*
        int a=3, b=2;
        var resultado = a+b;
        System.out.println("resultado de la suma = " + resultado);
        
        resultado = a-b;
        System.out.println("resultado de la resta = " +  resultado );
        
        resultado = a*b;
        System.out.println("resultado de la multiplicacion = " + resultado);
        
        resultado = a/b;
        System.out.println("resultado de la division = " + resultado);
        
        resultado = a%b;
        System.out.println("resultado del modulo = " + resultado);
        */
        
        /*
        operadores de asignacion y composicion
        */
                
        /*
        int a = 3, b=2;
        int c = a + 5 - b;
        System.out.println("c = " + c);
        
        a += 1;
        System.out.println("a = " + a);
        
        a += 7;
        System.out.println("a = " + a);
        
        a -= 2;
        System.out.println("a = " + a);
        
        a *= 3;
        System.out.println("a = " + a);
        
        a /= 2;
        System.out.println("a = " + a);
        
        a %= 2;
        System.out.println("a = " + a);
        */
        
        /*
        operadores unarios
        */
        
        /*
        var a = 3; 
        var b = -a;// cambio de signo
        System.out.println("a y b = " + a + " " + b);
        
        var c = true;
        var d = !c; // negacion booleana
        System.out.println("c y d = " + c + " " + d);
        
        // incremento
        //preincremento (simnolo antes de la variable)
        var e = 3;
        var f = ++e;
        System.out.println("e y f preincrementada = " + e + " " + f);
        // posincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++;
        System.out.println("g y h posincrementada = " +g + " " + h);
        
        // decremento
        //preincremento (simnolo antes de la variable)
        var a1 = 3;
        var b1 = --a1;
        System.out.println("e y f predecrementada = " + a1 + " " + b1);
        // posincremento (simbolo despues de la variable)
        var c1 = 5;
        var d1 = c1--;
        System.out.println("g y h posdecrementada = " +c1 + " " + d1);
        */
        
        /*
        operadores de igualdad
        */
        
        /*
        var a= 3;
        var b = 2;
        
        var c = (a == b);
        System.out.println("C es = " + c);
        
        var d = a != b;
        System.out.println("d = " + d);
        
        var cadena = "Hola";
        var cadena2 = "Adios";
        var e = cadena == cadena2;// compara las referencias en memoria
        System.out.println("e = " + e);
        
        var f = cadena.equals(cadena2); // compara el contenido de las cadenas
        System.out.println("f = " + f);
        */
        
        /*
        operadores relacionales
        */
        /*
        var a = 3;
        var b = 2;
        var g = a > b;
        System.out.println("g = " + g);
        g = a >= b;
        System.out.println("g = " + g);
        g = a ==b;
        System.out.println("g = " + g);
        */
        /*
        operadores condicionales
        */
        /*
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado = a >= valorMinimo && a <= valorMaximo;
        System.out.println("resultado = " + resultado);
        
        if (resultado){
            System.out.println("Dentro de rango");
        }else{
            System.out.println("fuera de rango");
        }
        
        // or
        var vacaciones = false;
        var diaDescanso = true;
        
        if(vacaciones || diaDescanso){
            System.out.println("puede asistir");
        }else{
            System.out.println("no puede asistir por trabajo");
        }
        */
        
        /*
        operador ternario
        */
        /*
        var resultado = (1 > 2) ? "verdadero" : "falso" ;
        System.out.println("resultado = " + resultado);
        
        var numero = 8;
        resultado = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("resultado = " + resultado);
        */
        
        /*
        precedencia de operadores
        */
        /*
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("z = " + z);
        
        var resultado = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado);
        */
        /*
        ejercicio rectanguolo
        */
        /*
        var consola = new Scanner(System.in);
        System.out.println("Ingrese el alto del rectangulo:");
        int alto = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el ancho del rectangulo:");
        int ancho = Integer.parseInt(consola.nextLine());
        
        var Area = alto * ancho;
        var Perimetro = (alto*2)+(ancho*2);
        System.out.println("Area: " + Area);
        System.out.println("Perimetro: " + Perimetro);
        */
        /*
        El mayor de 2 numeros
        */
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa el primer numero:");
        var num1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingresa el segundo numero:");
        var num2 = Integer.parseInt(consola.nextLine());
        
        if (num1 < num2){
            System.out.println("El numero mayor es: " + num2);
        }else if (num2 < num1){
            System.out.println("El numero mayor es: "+ num1);
        }else{
            System.out.println("Los numeros son iguales");
        }     
        
    }    
}
