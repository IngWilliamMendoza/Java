package ciclos;

public class CICLOS {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        while
         */
 /*
        var contador = 0;
        while(contador < 3){
            System.out.println("contador = " + contador);
            contador ++;
        }
         */
 /*
        Do While
         */

 /*
        var contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
        } 
        while(contador < 3); 
         */
 /*
         ciclo for
         */
 /*
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("el valor de i es = " + i);
                break;
            }
        }

        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("el valor de i es = " + i);

        }
         */
 /*
         etiquetas
         */
 /*
         inicio:         
         for (int i = 0; i < 10; i++){
             
             if (i == 6){                 
                 continue inicio;
             }
             System.out.println("i = " + i);
         }
         */
 /*
        String frase = "Empezando con Java desde cero";
        int i = -1;
        otraPalabra: //etiqueta

        // aqui no es conveniente colocar código.
        while (true) {
            i++;
            System.out.print("\n palabra: ");

            for (int a = i; a < frase.length(); a++) {
                char caracter = frase.charAt(a);
                if (caracter == ' ') {
                    i = a;
                    continue otraPalabra;
                }
                System.out.print(caracter);
            }
            break otraPalabra;
        }
         */

    }

}
