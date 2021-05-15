package nomina.app;

import nomina.dominio.Directo;
import nomina.dominio.Empleado;
import nomina.dominio.Freelancer;
import nomina.dominio.Nomina;
import nomina.dominio.Promotor;
import nomina.dominio.Vendedor;

import java.util.Arrays;

public class AppNomina {
    public static void main(String[] args) {
        Empleado juan = new Directo("Juan", 5360000);
        Empleado julian = new Vendedor("Julian", 2450000, 55510000);
        Empleado carolina = new Vendedor("Carolina", 990000, 62487000);
        Empleado johanna = new Freelancer("Johanna", 76000, 85);
        Empleado david = new Directo("David", 2895000);
        Empleado pedro = new Promotor("Pedro", 1500, 250, 48);
        Empleado gustavo = new Freelancer("Gustavo", 52500, 60);

        Nomina nomina = new Nomina(Arrays.asList(juan, julian, carolina, johanna, david, pedro, gustavo));

        nomina.listarDirectos();
        System.out.println("\n");
        nomina.listarFreelancers();
        System.out.println("\n");
        nomina.listarPromotores();
        System.out.println("\n");
        nomina.calcularNomina();
    }
}
