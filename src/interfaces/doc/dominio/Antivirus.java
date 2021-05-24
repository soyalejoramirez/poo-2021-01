package interfaces.doc.dominio;

import java.util.List;

public class Antivirus {
    private String nombre;

    public Antivirus(String nombre) {
        this.nombre = nombre;
    }

    public void escanear(List<ValidacionVirus> cosas) {
        cosas.forEach(cosa -> {
            if (cosa.buscarVirus() == true) {
                System.out.println(cosa.getNombre() + " tiene viruss!!");
            } else {
                System.out.println(cosa.getNombre() + " está bueno.");
            }
        });
    }
}
