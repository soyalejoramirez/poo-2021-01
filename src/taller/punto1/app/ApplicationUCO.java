package taller.punto1.app;

import taller.punto1.dominio.Asignatura;
import taller.punto1.dominio.Docente;
import taller.punto1.dominio.Estudiante;
import taller.punto1.dominio.Nota;

import java.util.Arrays;

public class ApplicationUCO {
    public static void main(String[] args) {
        Docente profe = new Docente("123456", "Alejandro Ramírez");
        Asignatura poo = new Asignatura("Programación Orientada a Objetos", profe);

        Estudiante julio = new Estudiante("123", "Julio Salas");
        Estudiante juanPablo = new Estudiante("321", "Juan Pablo Montoya");
        Estudiante juliana = new Estudiante("567", "Juliana Zapata");
        Estudiante jero = new Estudiante("987", "Jeronimo Escobar");

        Nota notaJulio = new Nota(poo);
        notaJulio.setNotasSeguimiento(Arrays.asList(3.2, 5.0, 3.0, 2.1, 5.0));
        notaJulio.setNotaParcial(3.2);
        notaJulio.setNotaFinal(3.5);

        julio.setNota(notaJulio);

        Nota notaJP = new Nota(poo);
        notaJP.setNotasSeguimiento(Arrays.asList(3.0, 4.1, 3.6, 2.9, 4.0));
        notaJP.setNotaParcial(2.0);
        notaJP.setNotaFinal(1.1);

        juanPablo.setNota(notaJP);

        Nota notaJuli = new Nota(poo);
        notaJuli.setNotasSeguimiento(Arrays.asList(3.4, 4.0, 2.1, 3.7, 3.5));
        notaJuli.setNotaParcial(2.7);
        notaJuli.setNotaFinal(4.0);

        juliana.setNota(notaJuli);

        Nota notaJero = new Nota(poo);
        notaJero.setNotasSeguimiento(Arrays.asList(5.0, 2.8, 3.3, 4.4, 3.1));
        notaJero.setNotaParcial(4.0);
        notaJero.setNotaFinal(5.0);

        jero.setNota(notaJero);

        // Pongamos el programa a funcionar
        poo.getEstudiantes().add(julio);
        poo.getEstudiantes().add(juanPablo);
        poo.getEstudiantes().add(juliana);
        poo.getEstudiantes().add(jero);

//        for (int i = 0; i < poo.getEstudiantes().size(); i++) {
//            System.out.println(poo.getEstudiantes().get(i).getNombre());
//        }
//
//        for(Estudiante estudiante: poo.getEstudiantes()) {
//            System.out.println(estudiante.getNombre());
//        }

        poo.getEstudiantes().forEach(estudiante -> {
            double definitiva = estudiante.getNota().calcularDefinitiva();

            if (definitiva >= 3) {
                System.out.println(estudiante.getNombre() + " ganaste " + poo.getNombre() + " en " + definitiva + "! :D");
            } else {
                System.out.println(estudiante.getNombre() + " perdiste " + poo.getNombre() + " en " + definitiva + "! :(");
            }
        });
    }
}
