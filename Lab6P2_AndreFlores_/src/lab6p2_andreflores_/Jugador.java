package lab6p2_andreflores_;

public class Jugador {

    private String nombreJugador;
    private String edad;
    private String posicion;

    public Jugador(String nombreJugador, String edad, String posicion) {
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
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
        return "nombre del jugador: " + nombreJugador + ", edad: " + edad + ", posicion: " + posicion;
    }

}
