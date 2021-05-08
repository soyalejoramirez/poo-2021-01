package herencia.dominio.vehiculos;

public class BicicletaMTB extends Bicicleta {
    public BicicletaMTB(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        this.velocidad = 12;
    }

    @Override
    public String toString() {
        return "Bicicleta de montaña";
    }
}
