package lab6p2_andrefloresr;

import java.util.ArrayList;

public class portatil extends consola {

    private String tamPantalla;
    private int bateria;
    private boolean estuche;

    public portatil(String tamPantalla, int bateria, boolean estuche, String identificacion, String fabricante, int aniosDeUso, double precio, ArrayList<juego> juegosDisponibles, String modelo) {
        super(identificacion, fabricante, aniosDeUso, precio, juegosDisponibles, modelo);
        this.tamPantalla = tamPantalla;
        this.bateria = bateria;
        this.estuche = estuche;
    }

    public String getTamPantalla() {
        return tamPantalla;
    }

    public void setTamPantalla(String tamPantalla) {
        this.tamPantalla = tamPantalla;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isEstuche() {
        return estuche;
    }

    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }

}
