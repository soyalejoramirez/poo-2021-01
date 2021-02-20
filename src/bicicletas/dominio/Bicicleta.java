package bicicletas.dominio;

public class Bicicleta {
    public long serial;
    public String marca;
    public String modelo;
    public String color;
    public long precio;
    public double velocidad;

    public void cambiarPrecio(long nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    public void cambiarPrecioYColor(long nuevoPrecio, String nuevoColor) {
        this.cambiarPrecio(nuevoPrecio);
        this.cambiarColor(nuevoColor);
    }

    public String obtenerInformacion() {
        String informacion = "Serial:" + this.serial + "\n Marca: " + this.marca +
                "\n modelo: " + this.modelo + "\n color: " + this.color + "\n precio: " + this.precio +
                "\n velocidad: " + this.velocidad + " km/h";

        return informacion;
    }

    public void acelerar(double incremento) {
        this.velocidad += incremento;
    }

    public boolean frenar(double decremento) {
        if ((this.velocidad + decremento) > 0) {
            this.velocidad -= decremento;
            return true;
        }

        return false;
    }
}
