package interfaces.musica.dominio;

public class AndresCepeda extends Musico implements Cantante, Guitarrista {
    public AndresCepeda() {
        super("Andres Cepeda");
    }

    @Override
    public void cantar() {
        System.out.println(getNombre() + " está cantando Besos Usados");
    }

    @Override
    public void tocarGuitarra() {
        System.out.println(getNombre() + " está tocando la guitarra en Día tras Día");
    }
}
