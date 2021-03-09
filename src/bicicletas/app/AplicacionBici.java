package bicicletas.app;

import bicicletas.dominio.Bicicleta;

public class AplicacionBici {
    public static void main(String[] args) throws InterruptedException {
        Bicicleta bici = null;

        for(int i = 0; i < 999999999; i++) {
            bici = new Bicicleta(544813, "Cannondale", "Madone 2021", "Verde", 10000000);
            bici = null;
        }

        System.out.println("Memoria libre después de terminar " + Runtime.getRuntime().freeMemory());
        System.gc();
        System.out.println("Memoria libre después del Garbage Collector " + Runtime.getRuntime().freeMemory());

//        Bicicleta otraBici = null;
//
//        System.out.println(bici);
//        System.out.println(otraBici);
//        System.out.println("\n");
//        otraBici = new Bicicleta(544813, "Trek", "Marlin 7 2021", "Blanca", 3200000);
//
//        System.out.println(bici);
//        System.out.println(otraBici);
//
//        System.out.println("\n");
//        System.out.println(bici.getColor());
//        System.out.println(otraBici.getColor());
//
//        System.out.println("\n");
//        System.out.println("Vamos a cambiar el color de otraBici");
//        otraBici.setColor("Negra");
//
//        System.out.println(bici.getColor());

//        bici.acelerar(35.2);
//        bici.frenar(18.2);
//
//        System.out.println(bici.obtenerInformacion());
//
//        bici.setPrecio(3500000);
//        bici.setColor("Esmerald Iris");
//
//        System.out.println(bici.obtenerInformacion());
    }
}
