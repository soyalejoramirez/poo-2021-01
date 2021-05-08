package herencia.dominio.vehiculos;

public class BicicletaRuta extends Bicicleta {
    public BicicletaRuta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public String toString() {
        return "Bicicleta de ruta";
    }
}
