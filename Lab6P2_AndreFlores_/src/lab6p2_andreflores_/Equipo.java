
package lab6p2_andreflores_;

public class Equipo {
    private String paisEquipo;
    private String nombreEquipo;
    private String ciudad;
    private String Estadio;

    public Equipo(String paisEquipo, String nombreEquipo, String ciudad, String Estadio) {
        this.paisEquipo = paisEquipo;
        this.nombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
        this.Estadio = Estadio;
    }

    public String getPaisEquipo() {
        return paisEquipo;
    }

    public void setPaisEquipo(String paisEquipo) {
        this.paisEquipo = paisEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }

    @Override
    public String toString() {
        return "Equipo: " + "pais del equipo: " + paisEquipo + ", nombre del equipo: " + nombreEquipo + ", ciudad: " + ciudad + ", Estadio: " + Estadio;
    }
    
}
