
package lab6p2_andrefloresr;

import java.util.Date;

public class juego {
    private String nombre;
    private String descripcion;
    private Date fechaDeLanzamiento;
    private double precio;
    private boolean estado;
    private boolean rentable;
    private boolean agregado;
    private int cantidadDisponible;

    public juego(String nombre, String descripcion, Date fechaDeLanzamiento, double precio, boolean estado, boolean rentable, boolean agregado, int cantidadDisponible) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.precio = precio;
        this.estado = estado;
        this.rentable = rentable;
        this.agregado = agregado;
        this.cantidadDisponible = cantidadDisponible;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(Date fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
}
