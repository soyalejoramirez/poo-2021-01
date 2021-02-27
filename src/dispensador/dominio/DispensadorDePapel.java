package dispensador.dominio;

public class DispensadorDePapel {
    public String marca;
    public String tipo;
    public int capacidadMaxima;
    public int cantidadActual;
    public String color;

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
        System.out.println("Se llenó el dispensador");
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
}
