package herencia.dominio.vehiculos;

public class BicicletaElectrica extends Bicicleta {
    public BicicletaElectrica(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        this.velocidad = 35;
    }

    @Override
    public String toString() {
        return "Bicicleta electrica";
    }
}
