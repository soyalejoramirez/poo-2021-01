package interfaces.musica.app;

import interfaces.musica.dominio.AndresCepeda;
import interfaces.musica.dominio.Cantante;
import interfaces.musica.dominio.CesarMora;
import interfaces.musica.dominio.Guitarrista;
import interfaces.musica.dominio.Musico;
import interfaces.musica.dominio.Slash;
import interfaces.musica.dominio.Trompetista;

import java.util.Arrays;
import java.util.List;

public class AppMusicos {
    public static void main(String[] args) {
        AndresCepeda andresCepeda = new AndresCepeda();
        Slash slash = new Slash();
        Musico cesarMora = new CesarMora();

        List<Musico> musicos = Arrays.asList(andresCepeda, slash, cesarMora);

        musicos.forEach(musico -> {
            if (musico instanceof Cantante) {
                ((Cantante) musico).cantar();
            }

            if (musico instanceof Guitarrista) {
                ((Guitarrista) musico).tocarGuitarra();
            }

            if (musico instanceof Trompetista) {
               ((Trompetista) musico).tocarTrompeta();
            }
        });
    }
}
