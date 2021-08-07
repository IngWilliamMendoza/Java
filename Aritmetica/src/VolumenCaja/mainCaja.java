
package VolumenCaja;

public class mainCaja {
    public static void main(String[] args) {
        
        Caja empaque = new Caja(5,5,5);
        System.out.println("El volumen del empaque es: " + empaque.calculateVolume());
    }
}
