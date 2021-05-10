package herencia.app;

import herencia.dominio.vehiculos.Bicicleta;
import herencia.dominio.vehiculos.BicicletaCrono;
import herencia.dominio.vehiculos.BicicletaMTB;
import herencia.dominio.vehiculos.BicicletaRuta;
import herencia.dominio.vehiculos.Taxi;
import herencia.dominio.vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class AppHerencia {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Vehiculo vehiculo = new BicicletaRuta("Cannondale", "R7");
        Vehiculo crono = new BicicletaCrono("Pinarello", "Giro2021");
        Vehiculo taxi = new Taxi("Chevrolet", "Spark", "Taxiapp");
        Vehiculo bici = new BicicletaMTB("GW", "Shark");
        Vehiculo mtb = new BicicletaMTB("Trek", "Marlin 7");

        vehiculos.add(vehiculo);
        vehiculos.add(crono);
        vehiculos.add(taxi);
        vehiculos.add(bici);
        vehiculos.add(mtb);

        vehiculos.forEach(vehi -> {
            vehi.acelerar();
            System.out.println(vehi + " va a " + vehi.getVelocidad() + " km/h");
        });

        vehiculos.forEach(vehi -> {
            if (vehi instanceof Taxi) {
                System.out.println("ENTRÓ PORQUE ES TAXI!");
                ((Taxi) vehi).recogerPasajero();
                ((Taxi) vehi).recogerPasajero();

                System.out.println("Lleva " + ((Taxi) vehi).getNroPasajeros() + " pasajeros");
            }

            if (vehi instanceof BicicletaMTB) {
                System.out.println("¡EEEEEEENTRÓ PORQUE ES UNA BICI! ");
            }
        });
    }
}
