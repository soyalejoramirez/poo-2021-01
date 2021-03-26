package dispensador.dominio;

public class DispensadorDePapel {
    private String marca;
    private String tipo;
    private String tipoDePapel;
    private int capacidadMaxima;
    private int cantidadActual;
    private String color;

    public DispensadorDePapel(String marca) {
        this.marca = marca;
        this.color = "BLANCO";
    }

    public DispensadorDePapel(String marca, String tipo) {
        this(marca);
        this.tipo = tipo;
        this.capacidadMaxima = 100;
    }

    public DispensadorDePapel(String marca, String tipo, int capacidadMaxima) {
        this(marca, tipo);
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = 0;
    }

    public boolean dispensar() {
        if (estaVacio() == false) {
            this.cantidadActual--;
            return true;
        }

        return false;
    }

    public void llenar() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public boolean recargar(int cantidadARecargar) {
        if ((this.cantidadActual + cantidadARecargar) <= capacidadMaxima) {
            this.cantidadActual += cantidadARecargar;
            return true;
        }

        return false;
    }

    public boolean estaVacio() {
        return cantidadActual == 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public String getColor() {
        return color;
    }

    public String getTipoDePapel() {
        return tipoDePapel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipoDePapel(String tipoDePapel) {
        this.tipoDePapel = tipoDePapel;
    }
}
