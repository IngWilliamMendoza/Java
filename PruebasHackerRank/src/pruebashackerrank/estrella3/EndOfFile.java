
package pruebashackerrank.estrella3;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            count++;            
            String word = scan.nextLine();
            System.out.println(count +" "+ word);
        }
        
    }
}
