package herencia.app;

import herencia.dominio.geometria.Circulo;
import herencia.dominio.geometria.Cuadrado;
import herencia.dominio.geometria.FiguraGemetrica;
import herencia.dominio.geometria.TrianguloRectangulo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppGeometria {
    public static void main(String[] args) {
        FiguraGemetrica circulo = new Circulo(6.5);
        FiguraGemetrica triangulo = new TrianguloRectangulo(3, 5);
        FiguraGemetrica cuadrado = new Cuadrado(6.9, 7.1);

        List<FiguraGemetrica> figuras = new ArrayList<>(Arrays.asList(circulo, triangulo, cuadrado));

        figuras.forEach(figura -> {
            System.out.println("El area del " + figura + " es " + figura.calcularArea());
            System.out.println("El perimetro del " + figura + " es " + figura.calcularPerimetro());
        });
    }
}
