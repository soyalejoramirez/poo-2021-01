package pantalla.dominio;

public class Persona {
    private String nombre;
    private short edad;

    public Persona(String nombre, short edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public short getEdad() {
        return edad;
    }
}
