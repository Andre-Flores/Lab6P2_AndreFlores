
package lab6p2_andrefloresr;

import java.util.ArrayList;

public class estacionaria extends consola {
    private int numControles;
    private int almacenamiento;
    private String tipoDeConexion;

    public estacionaria(int numControles, int almacenamiento, String tipoDeConexion, String identificacion, String fabricante, int aniosDeUso, double precio, ArrayList<juego> juegosDisponibles, String modelo) {
        super(identificacion, fabricante, aniosDeUso, precio, juegosDisponibles, modelo);
        this.numControles = numControles;
        this.almacenamiento = almacenamiento;
        this.tipoDeConexion = tipoDeConexion;
    }

    public int getNumControles() {
        return numControles;
    }

    public void setNumControles(int numControles) {
        this.numControles = numControles;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoDeConexion() {
        return tipoDeConexion;
    }

    public void setTipoDeConexion(String tipoDeConexion) {
        this.tipoDeConexion = tipoDeConexion;
    }
    
}
