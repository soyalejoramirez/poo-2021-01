package taller.punto2.app;

import taller.punto2.domain.Dispensador;
import taller.punto2.domain.Producto;

import java.util.List;

public class Tienda {
    public static void main(String[] args) {
        Dispensador dispensador = new Dispensador("Nacional de Chocolates");

        Producto deTodito = new Producto((short) 1, "De todito", 2000, 5);
        Producto cocaCola = new Producto((short) 2, "Coca Cola", 2500, 1);
        Producto chocolatinaJet = new Producto((short) 3, "Chocolatina JET", 400, 8);
        Producto choclitos = new Producto((short) 4, "Choclitos", 1300, 4);

        dispensador.agregar(deTodito);
        dispensador.agregar(cocaCola);
        dispensador.agregar(chocolatinaJet);
        dispensador.agregar(choclitos);

        dispensador.sacarProducto("coca cola");

        System.out.println("\n *** AGOTADOS ***");
        List<String> agotados = dispensador.consultarAgotados();

        for (String agotado : agotados) {
            System.out.println(agotado);
        }

        dispensador.aumentarProducto((short) 2, 6);
        dispensador.aumentarProducto("choclitos", 8);

        System.out.println("\n *** TODOS ***");
        List<String> todos = dispensador.consultarTodos();

        for (String p : todos) {
            System.out.println(p);
        }
    }
}
