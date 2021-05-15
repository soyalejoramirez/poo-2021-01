package nomina.dominio;

public class Directo extends Empleado {
    public static final double PORC_SALUD = 0.07;
    public static final double PORC_PENSION = 0.065;
    private long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    protected long calcularSalario() {
        return this.salario - calcularSalud() - calcularPension();
    }

    public long calcularSalud() {
        return (long) (this.salario * PORC_SALUD);
    }

    public long calcularPension() {
        return (long) (this.salario * PORC_PENSION);
    }

    public long getSalario() {
        return salario;
    }
}
