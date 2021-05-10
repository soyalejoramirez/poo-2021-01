package herencia.dominio.vehiculos;

public abstract class Bicicleta extends Vehiculo {
    private int nroCambios;
    private double cadencia;

    public Bicicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public String toString() {
        return "Bicicleta";
    }

    public int getNroCambios() {
        return nroCambios;
    }

    public void setNroCambios(int nroCambios) {
        this.nroCambios = nroCambios;
    }

    public double getCadencia() {
        return cadencia;
    }

    public void setCadencia(double cadencia) {
        this.cadencia = cadencia;
    }
}
