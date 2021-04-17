package pantalla.app;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class App {
    public static final int MARTE = 0;
    public static final int MERCURIO = 1;
    public static final int TIERRA = 2;
    public static final int VENUS = 3;

    public static void main(String[] args) throws IOException {
        //ImageIcon icon = new ImageIcon(new URL("https://upload.wikimedia.org/wikipedia/commons/2/25/LogoUCO_UCO_shield.png"));
        ImageIcon icon = new ImageIcon(App.class.getResourceAsStream("uco.png").readAllBytes());

        //JOptionPane.showMessageDialog(null, "Hola POO 2021-1!", "Alejandro Ramirez", JOptionPane.QUESTION_MESSAGE, icon);

        //String nombre = JOptionPane.showInputDialog(null, "Cual es tu nombre? ", "Johanna");
        //List<String> ciudades = Arrays.asList("El Retiro", "Rionegro", "Santuario", "La Ceja", "Marinilla", "Guarne", "Ituango");

        // ciudad = (String) JOptionPane.showInputDialog(null, "¿Dónde vives?", "POO", JOptionPane.QUESTION_MESSAGE, null, ciudades.toArray(), "Guarne");

//        int botonSeleccionado = JOptionPane.showConfirmDialog(null, "Si o no?", "POO", JOptionPane.OK_CANCEL_OPTION);
//
//        switch (botonSeleccionado) {
//            case JOptionPane.YES_OPTION: {
//                mostrarMensaje("Seleccionó que si");
//                break;
//            }
//            case JOptionPane.NO_OPTION: {
//                mostrarMensaje("Seleccionó que no");
//                break;
//            }
//            case JOptionPane.CANCEL_OPTION: {
//                mostrarMensaje("Canceló");
//                break;
//            }
//            default:
//                mostrarMensaje("Cerró");
//        }
        List<String> opciones = Arrays.asList("Marte", "Mercurio", "Tierra", "Venus");
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "Selecciona una de las siguientes opciones", "UCO - POO", 0,JOptionPane.QUESTION_MESSAGE,null, opciones.toArray(), null);

        switch (opcionSeleccionada) {
            case MARTE: {
                mostrarMensaje("Seleccionó MARTE");
                break;
            }
            case MERCURIO: {
                mostrarMensaje("Seleccionó MERCURIO");
                break;
            }
            case TIERRA: {
                mostrarMensaje("Seleccionó TIERRA");
                break;
            }
            case VENUS: {
                mostrarMensaje("Seleccionó VENUS");
                break;
            }
            default:
                mostrarMensaje("No seleccionó nada :(");
        }
    }

    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "POO", JOptionPane.PLAIN_MESSAGE);
    }
}
