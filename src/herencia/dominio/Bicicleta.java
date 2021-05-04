package herencia.dominio;

public class Bicicleta extends Vehiculo {
    private int nroCambios;
    private double cadencia;

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
