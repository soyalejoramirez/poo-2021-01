package interfaces.doc.dominio;

public class Juego implements ValidacionVirus {
    private String nombre;
    private String dificultad;

    public Juego(String nombre, String dificultad) {
        this.nombre = nombre;
        this.dificultad = dificultad;
    }

    @Override
    public boolean buscarVirus() {
        return dificultad.equalsIgnoreCase("facil");
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
