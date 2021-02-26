package dispensador.dominio;

public class DispensadorDePapel {
    public String marca;
    public String tipo;
    public int capacidadMaxima;
    public int cantidadActual;
    public String color;

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
