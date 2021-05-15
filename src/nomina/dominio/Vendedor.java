package nomina.dominio;

public class Vendedor extends Directo {
    public static final double PORC_VENDEDORES_QUE_GANAN_MENOS_TOPE_COMISION = 0.045;
    public static final double PORC_VENDEDORES_QUE_GANAN_MAS_TOPE_COMISION = 0.05;
    public static final long TOPE_COMISION = 1000000;

    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    @Override
    protected long calcularSalario() {
        return super.calcularSalario() + calcularComision();
    }

    public long calcularComision() {
        if (this.getSalario() < TOPE_COMISION) {
            return (long) (this.ventasDelMes * PORC_VENDEDORES_QUE_GANAN_MENOS_TOPE_COMISION);
        } else {
            return (long) (this.ventasDelMes * PORC_VENDEDORES_QUE_GANAN_MAS_TOPE_COMISION);
        }
    }
}
