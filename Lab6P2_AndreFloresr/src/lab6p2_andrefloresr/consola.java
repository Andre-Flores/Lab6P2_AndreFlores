package lab6p2_andrefloresr;

import java.util.ArrayList;
import java.util.Random;

public class consola {

    private String identificacion;
    private String fabricante;
    private int aniosDeUso;
    private double precio;
    private ArrayList<juego> juegosDisponibles;
    private String modelo;

    public consola(String identificacion, String fabricante, int aniosDeUso, double precio, ArrayList<juego> juegosDisponibles, String modelo) {
        this.identificacion = identificacion;
        this.fabricante = fabricante;
        this.aniosDeUso = aniosDeUso;
        this.precio = precio;
        this.juegosDisponibles = juegosDisponibles;
        this.modelo = modelo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAniosDeUso() {
        return aniosDeUso;
    }

    public void setAniosDeUso(int aniosDeUso) {
        this.aniosDeUso = aniosDeUso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<juego> getJuegosDisponibles() {
        return juegosDisponibles;
    }

    public void setJuegosDisponibles(ArrayList<juego> juegosDisponibles) {
        this.juegosDisponibles = juegosDisponibles;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String generarIdentificacion() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        StringBuilder identificacion = new StringBuilder();

        Random random = new Random();

        // Generar 4 numeros
        for (int i = 0; i < 4; i++) {
            int numIndex = random.nextInt(numeros.length());
            identificacion.append(numeros.charAt(numIndex));
        }

        // Generar 4 letras
        for (int i = 0; i < 4; i++) {
            int letraIndex = random.nextInt(letras.length());
            identificacion.append(letras.charAt(letraIndex));
        }

        return identificacion.toString();
    }
}
