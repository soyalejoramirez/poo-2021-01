package herencia.dominio.vehiculos;

public class Taxi extends Vehiculo {
    private String regCirculacion;
    private String empresa;
    private int nroPasajeros;

    public Taxi(String marca, String modelo, String empresa) {
        super(marca, modelo);
        this.empresa = empresa;
    }

    @Override
    public void acelerar() {
        this.velocidad = 62;
    }

    public void recogerPasajero() {
        this.nroPasajeros++;
    }

    public void bajarPasajero() {
        this.nroPasajeros--;
    }

    @Override
    public String toString() {
        return "Taxi";
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
