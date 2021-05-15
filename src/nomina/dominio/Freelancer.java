package nomina.dominio;

public class Freelancer extends Empleado {
    private long valorHora;
    private int horasTrabajadas;

    public Freelancer(String nombre, long valorHora, int horasTrabajadas) {
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    protected long calcularSalario() {
        return this.horasTrabajadas * this.valorHora;
    }
}
