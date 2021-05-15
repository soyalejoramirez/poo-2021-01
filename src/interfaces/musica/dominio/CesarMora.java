package interfaces.musica.dominio;

public class CesarMora extends Musico implements Cantante, Trompetista {
    public CesarMora() {
        super("Cesar Mora");
    }

    @Override
    public void cantar() {
        System.out.println(getNombre() + " está cantando Canela");
    }

    @Override
    public void tocarTrompeta() {
        System.out.println(getNombre() + " está tocando trompeta en A tu manera");
    }
}
