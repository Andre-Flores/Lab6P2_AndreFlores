package lab6p2_andreflores_;

public class Jugador {

    private String nombreJugador;
    private int edad;
    private String posicion;

    public Jugador(String nombreJugador, int edad, String posicion) {
        this.nombreJugador = nombreJugador;
        this.edad = edad;
        this.posicion = posicion;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return nombreJugador;
    }

}
