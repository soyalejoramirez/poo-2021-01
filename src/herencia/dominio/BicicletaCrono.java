package herencia.dominio;

public class BicicletaCrono extends BicicletaRuta {
    @Override
    public void acelerar() {
        System.out.println("Acelerando como CRONO!");
        super.acelerar();
    }
}
