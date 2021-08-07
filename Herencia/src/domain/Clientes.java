package domain;

import java.util.Date;

public class Clientes extends Persona {

    private int idCliente;    
    private Date fecha;
    private boolean vip;
    private static int contarCliente;

    public Clientes() {
    }

    public Clientes(Date fecha, boolean vip, String nombre,
            String genero, int edad, String direccion) {
        super(nombre,genero, edad, direccion);
        this.idCliente = Clientes.contarCliente++;        
        this.fecha = fecha;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clientes{idCliente=").append(this.idCliente);        
        sb.append(", fecha=").append(this.fecha);
        sb.append(", vip=").append(this.vip);        
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }

}
