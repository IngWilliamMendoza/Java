
package domain;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo) {        
//        super(nombre); // si se usa el this() no se puede usar el super
        this();
        this.nombre = nombre; // llama al atributo del padre y le asigna valor
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", nombre= ").append(this.nombre);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append('}');
        sb.append("\nPadre = ").append(super.toString());
        return sb.toString();
    }
    
    

    
    
    
}
