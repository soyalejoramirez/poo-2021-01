package herencia.app;

import herencia.dominio.geometria.Circulo;
import herencia.dominio.geometria.FiguraGemetrica;

public class AppGeometria {
    public static void main(String[] args) {
        FiguraGemetrica circulo = new Circulo(6.5);

        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());
    }
}
