package herencia.dominio.vehiculos;

public class BicicletaCrono extends BicicletaRuta {
    public BicicletaCrono(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        this.velocidad = 80;
    }

    @Override
    public String toString() {
        return "Bicicleta de contrarreloj";
    }
}
