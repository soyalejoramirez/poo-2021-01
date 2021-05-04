package herencia.app;

import herencia.dominio.BicicletaCrono;
import herencia.dominio.BicicletaElectrica;
import herencia.dominio.Taxi;
import herencia.dominio.Vehiculo;

public class AppHerencia {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        BicicletaCrono crono = new BicicletaCrono();
        Taxi taxi = new Taxi();
        BicicletaElectrica electrica = new BicicletaElectrica();

        vehiculo.acelerar();
        System.out.println("Vehiculo velocidad: " + vehiculo.getVelocidad() + " km/h");

        crono.acelerar();
        System.out.println("Bicicleta de contrarreloj velocidad: " + crono.getVelocidad() + " km/h");

        taxi.acelerar();
        System.out.println("Taxi velocidad: " + taxi.getVelocidad() + " km/h");

        electrica.acelerar();
        System.out.println("Bicicleta electrica velocidad: " + electrica.getVelocidad() + " km/h");
    }
}
