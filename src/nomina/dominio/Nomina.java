package nomina.dominio;

import java.util.List;

public class Nomina {
    private List<Empleado> empleados;

    public Nomina(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void calcularNomina() {
        this.empleados.forEach(empleado -> System.out.println("El salario de " + empleado.getNombre() + " es de $" + empleado.calcularSalario()));
    }

    public void listarDirectos() {
        this.empleados.forEach(empleado -> {
            if (empleado instanceof Vendedor) {
                System.out.println(empleado.getNombre() + " es Vendedor.");
            } else if (empleado instanceof Directo) {
                System.out.println(empleado.getNombre() + " es Directo.");
            }
        });
    }

    public void listarFreelancers() {
        this.empleados.forEach(empleado -> {
            if (empleado instanceof Freelancer) {
                System.out.println(empleado.getNombre() + " es Freelancer.");
            }
        });
    }

    public void listarPromotores() {
        this.empleados.forEach(empleado -> {
            if (empleado instanceof Promotor) {
                System.out.println(empleado.getNombre() + " es Promotor.");
            }
        });
    }
}
