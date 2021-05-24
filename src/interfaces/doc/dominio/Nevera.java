package interfaces.doc.dominio;

public class Nevera implements ValidacionVirus {
    private String marca;

    public Nevera(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean buscarVirus() {
        return !marca.equalsIgnoreCase("samsung");
    }

    @Override
    public String getNombre() {
        return marca;
    }
}
