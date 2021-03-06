package dispensador.app;

import dispensador.dominio.DispensadorDePapel;

public class AppDispensador {
    public static void main(String[] args) {
        DispensadorDePapel dispensador = new DispensadorDePapel("Familia", "Toallas de baño", 40);

        System.out.println("El color: " + dispensador.getColor());

        dispensador.llenar();
        dispensador.dispensar();
        dispensador.dispensar();
        dispensador.dispensar();
        dispensador.dispensar();

        System.out.println("El dispensador tiene " + dispensador.getCantidadActual() + " toallas.");

        dispensador.recargar(4);

        System.out.println("El dispensador tiene " + dispensador.getCantidadActual() + " toallas.");
    }
}
