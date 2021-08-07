package operaciones;

public class Aritmetica {

    private int a;
    private int b;
    
    //Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando Constructor vacio");
    }
    
    public Aritmetica(int a , int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando Contructor con parametros: " + a +" "+ b);
    }

    //Metodo
//    public void sumar(int valor1, int valor2){
//        int resultado = a + b;
//        System.out.println("resultado = " + resultado);
//    }
//    
//    public int getsumar(){
//        return a + b;
//    }
//    
//    public int sumarConArgumentos(int arg1, int arg2){
//        this.a = arg1;
//        this.b = arg2;
//        return this.getsumar();
//uso del this y del set&get
    public void setDatos(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("a: " + this.a + "b: " + this.b);
    }

}

