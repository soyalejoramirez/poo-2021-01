package pantalla.app;

import pantalla.dominio.PesoEnPlanetas;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class AppPlanetas {
    public static final int MARTE = 0;
    public static final int MERCURIO = 1;
    public static final int TIERRA = 2;
    public static final int VENUS = 3;

    public static void main(String[] args) {
        List<String> opciones = Arrays.asList("Marte", "Mercurio", "Tierra", "Venus");
        boolean seguirEjecutando = true;

        String nombre = JOptionPane.showInputDialog(null, "¿Cómo te llamas?", "Peso en planetas", JOptionPane.QUESTION_MESSAGE);
        double pesoIngresado = Double.parseDouble(JOptionPane.showInputDialog(null, nombre + ", ¿cuánto pesas en kg?", "Peso en planetas", JOptionPane.QUESTION_MESSAGE));

        while(seguirEjecutando) {
            int opcion = JOptionPane.showOptionDialog(null, "¿En qué planeta quieres saber tu peso?", "Peso en planetas", 0,JOptionPane.QUESTION_MESSAGE,null, opciones.toArray(), null);

            switch (opcion) {
                case MARTE: {
                    double pesoMarte = PesoEnPlanetas.calcularPesoEnMarte(pesoIngresado);
                    mostrarMensaje(nombre + ", en Marte pesas " + pesoMarte + " kg");
                    break;
                }
                case MERCURIO: {
                    double pesoMercurio = PesoEnPlanetas.calcularPesoEnMercurio(pesoIngresado);
                    mostrarMensaje(nombre + ", en Mercurio pesas " + pesoMercurio + " kg");
                    break;
                }
                case TIERRA: {
                    double pesoEnTierra = PesoEnPlanetas.calcularPesoEnTierra(pesoIngresado);
                    mostrarMensaje(nombre + ", en la Tierra pesas " + pesoEnTierra + " kg");
                    break;
                }
                case VENUS: {
                    double pesoVenus = PesoEnPlanetas.calcularPesoEnVenus(pesoIngresado);
                    mostrarMensaje(nombre + ", en Venus pesas " + pesoVenus + " kg");
                    break;
                }
                default:
                    mostrarMensaje("No seleccionó ningún planeta :(");
                    seguirEjecutando = false;
            }
        }
    }

    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Peso en planetas", JOptionPane.INFORMATION_MESSAGE);
    }
}
