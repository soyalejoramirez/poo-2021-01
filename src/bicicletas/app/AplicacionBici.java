package bicicletas.app;

import bicicletas.dominio.Bicicleta;

public class AplicacionBici {
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta(544813, "Trek", "Marlin 7 2021", "Blanca", 3200000);

        bici.acelerar(35.2);
        bici.frenar(18.2);

        System.out.println(bici.obtenerInformacion());

        bici.cambiarPrecioYColor(3500000, "Esmerald Iris");

        System.out.println(bici.obtenerInformacion());
    }
}
