
package VolumenCaja;

public class Caja {
    private int ancho;
    private int alto;
    private int largo;
    
    public Caja(){
        
    }
    
    public Caja(int ancho, int alto, int largo){
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }
    
    public int calculateVolume(){
        var volumen = this.ancho * this.alto * this.largo;
        return volumen;
    }
    
}
