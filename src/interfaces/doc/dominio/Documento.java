package interfaces.doc.dominio;

public abstract class Documento implements ValidacionVirus {
    private String nombre;
    private double peso;

    public Documento(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }
}
