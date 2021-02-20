package bicicletas.app;

import bicicletas.dominio.Bicicleta;

public class AplicacionBici {
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();

        bici.serial = 544813;
        bici.marca = "Trek";
        bici.modelo = "Marlin 7 2021";
        bici.color = "Blanca";
        bici.precio = 3000000;

        bici.acelerar(35.2);
        bici.frenar(18.2);

        System.out.println(bici.obtenerInformacion());

        bici.cambiarPrecioYColor(3500000, "Esmerald Iris");

        System.out.println(bici.obtenerInformacion());
    }
}
