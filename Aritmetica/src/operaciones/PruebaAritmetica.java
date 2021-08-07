package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        //Variables locales
        int a;
        int b;
        miMetodo();

//        Aritmetica aritmetical = new Aritmetica();
//        Aritmetica arit = new Aritmetica(5, 10);
        //        aritmetical.a = 5;
        //        aritmetical.b = 2;
        //        aritmetical.sumar(aritmetical.a, aritmetical.b);
        //        
        //        int resultado = aritmetical.getsumar();
        //        System.out.println("resultado = " + resultado);

        //        System.out.println("metodo con argumentos");        
        //        System.out.println("valor: "+ aritmetical.sumarConArgumentos(5, 4));

        //        uso del this y del set y get
        //         aritmetical.setDatos(10, 5);        
    }
    
    public static void miMetodo(){
        //la variable esta fuera del alcance
        // this.a = 10;
        System.out.println("Metodo statico");
    }
}
