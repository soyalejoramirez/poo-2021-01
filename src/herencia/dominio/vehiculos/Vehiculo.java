package herencia.dominio.vehiculos;

import java.util.Random;

public abstract class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private int anioModelo;
    protected double velocidad;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void acelerar();

    public void frenar() {
        this.velocidad -= new Random().nextInt(15);
    }

    @Override
    public String toString() {
        return "Vehiculo";
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioModelo() {
        return anioModelo;
    }

    public double getVelocidad() {
        return velocidad;
    }
}
