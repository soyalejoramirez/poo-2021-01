package banco.dominio;

public class Banco {
    // Atributos
    private String nit;
    private String nombre;
    private Persona gerente;

    // Constructores
    public Banco(String nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
    }

    // Métodos

    // Getters & Setters

    public String getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona getGerente() {
        return gerente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGerente(Persona gerente) {
        this.gerente = gerente;
    }
}
