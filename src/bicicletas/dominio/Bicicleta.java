package bicicletas.dominio;

public class Bicicleta {
    private long serial;
    private String marca;
    private String modelo;
    private String color;
    private long precio;
    private double velocidad;

    public Bicicleta(long serial, String marca, String modelo, String color, long precio) {
        this.serial = serial;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.velocidad = 0;
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

    public long getSerial() {
        return serial;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public long getPrecio() {
        return precio;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }
}
