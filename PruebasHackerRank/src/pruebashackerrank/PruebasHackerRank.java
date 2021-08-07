package pruebashackerrank;
import java.util.Scanner;

public class PruebasHackerRank {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int valor = a + 1 * b;
            System.out.print(valor);
            for(int j=1; j<n; j++){
                valor = valor + ((int)(Math.pow(2, j)*b));
                System.out.print(" " + valor);         
            }
            System.out.println("");
        }
        in.close();   
    }
    
}