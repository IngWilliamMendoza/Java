package clasescanner;

/**
 * @author William Mendoza
 */
public class ClaseScanner {

    public static void main(String[] args) {
        // TODO code application logic here
        //redondear a un numero decimal a un numero especifico de cifras
        /*
        System.out.printf("%.2f%n", 12.3698);
        System.out.printf("%.3f%n", 12.3698);
        // añadir un signo al numero
        System.out.printf("%+.3f%n", 12.3698);
        // formato numeros enteros
        System.out.printf("%d%n", 100);
        System.out.printf("%+d%n", 100);
        // formatear varias variables en la consola
        int x = 10;
        var y = 20;
        var z = 1.456;
        System.out.printf("x= %+d %d %.2f %n", x,y,z);
        double n = 10.503;
        int w = 20;
        System.out.printf("n = %1$.2f x = %2$d %n", n, w);
         */

        String s1 = "Python";
        int n = 1;
        System.out.printf("%1$-14s %2$03d %n", s1, n);

        // ejemplo completo
        double q = 1.0 / 3.0;
        System.out.printf("1.0/3.0 = %5.3f %n", q);
        System.out.printf("1.0/3.0 = %7.5f %n", q);
        q = 1.0 / 2.0;
        System.out.printf("1.0/2.0 = %09.3f %n", q);
        q = 1000.0 / 3.0;
        System.out.printf("1000/3.0 = %7.1e h%n", q);
        q = 3.0 / 4567.0;
        System.out.printf("3.0/4567.0 = %7.3e %n", q);
        q = -1.0 / 0.0;
        System.out.printf("-1.0/0.0 = %7.2e %n", q);
        q = 0.0 / 0.0;
        System.out.printf("0.0/0.0 = %5.2e %n", q);
        System.out.printf("pi = %5.3f, e = %10.4f %n", Math.PI, Math.E);
        double r = 1.1;
        System.out.printf("C = 2 * %1$5.5f * %2$4.1f, " + "A = %2$4.1f * %2$4.1f * %1$5.5f %n", Math.PI, r);
    }
}


