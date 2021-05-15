package nomina.dominio;

public class Promotor extends Empleado {
    public static final int VALOR_COMPRA_VOLANTE = 17000;
    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolante;

    public Promotor(String nombre, int volantesRepartidos, long valorVolante, int comprasVolante) {
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolante = comprasVolante;
    }

    @Override
    protected long calcularSalario() {
        return (this.valorVolante * this.volantesRepartidos) + (this.comprasVolante * VALOR_COMPRA_VOLANTE);
    }
}
