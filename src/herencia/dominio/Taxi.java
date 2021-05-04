package herencia.dominio;

public class Taxi extends Vehiculo {
    private String regCirculacion;
    private String empresa;
    private int nroPasajeros;

    public void recogerPasajero() {
        this.nroPasajeros++;
    }

    public void bajarPasajero() {
        this.nroPasajeros--;
    }

    public String getRegCirculacion() {
        return regCirculacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getNroPasajeros() {
        return nroPasajeros;
    }

    public void setRegCirculacion(String regCirculacion) {
        this.regCirculacion = regCirculacion;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
