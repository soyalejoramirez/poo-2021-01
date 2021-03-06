package banco.dominio;

public class Persona {
    private int cedula;
    private String nombre;
    private String estadoCivil;
    private String genero;

    public Persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
