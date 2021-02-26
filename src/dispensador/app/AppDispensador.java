package dispensador.app;

import dispensador.dominio.DispensadorDePapel;

public class AppDispensador {
    public static void main(String[] args) {
        DispensadorDePapel dispensador = new DispensadorDePapel();

        dispensador.capacidadMaxima = 40;

        dispensador.llenar();
        dispensador.dispensar();
        dispensador.dispensar();
        dispensador.dispensar();
        dispensador.dispensar();

        System.out.println("El dispensador tiene " + dispensador.cantidadActual + " toallas.");

        dispensador.recargar(4);

        System.out.println("El dispensador tiene " + dispensador.cantidadActual + " toallas.");
    }
}
