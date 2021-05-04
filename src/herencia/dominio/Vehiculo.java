package herencia.dominio;

import java.util.Random;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private int anioModelo;
    private double velocidad;

    public void acelerar() {
        System.out.println("Acelerandoooooo!");
        this.velocidad += new Random().nextInt(60);
    }

    public void frenar() {
        this.velocidad -= new Random().nextInt(15);
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
