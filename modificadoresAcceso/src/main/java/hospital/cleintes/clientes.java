package hospital.cleintes;

import java.util.*;
import java.io.*;

public class clientes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int arrayValores[] = new int[n]; 
            int valor = a + 1 * b;
            arrayValores[0]= valor;
            System.out.println("arrayValores = " + arrayValores[0]);
//            for (int j = 0; j<n; j++){
//                
//            }
        }
        in.close();       
    }
}
