package interfaces.musica.dominio;

public abstract class Musico {
    private String nombre;

    public Musico(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
