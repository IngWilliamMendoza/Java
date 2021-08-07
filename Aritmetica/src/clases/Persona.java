
package clases;

public class Persona {
    protected String nombre;
    protected String apellido;
    
    public void desplegarInformacion(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;        
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getNombre(){
        return this.nombre;
    }
    
}
