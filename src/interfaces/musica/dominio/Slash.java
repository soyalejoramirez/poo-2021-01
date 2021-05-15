package interfaces.musica.dominio;

public class Slash extends Musico implements Guitarrista {
    public Slash() {
        super("Slash");
    }

    @Override
    public void tocarGuitarra() {
        System.out.println(getNombre() + " está tocando la guitarra en Sweet Child O' Mine de GNR");
    }
}
