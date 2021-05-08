package herencia.app;

import herencia.dominio.geometria.Circulo;
import herencia.dominio.geometria.FiguraGemetrica;

import java.util.ArrayList;
import java.util.List;

public class AppGeometria {
    public static void main(String[] args) {
        List<FiguraGemetrica> figuras = new ArrayList<>();

        FiguraGemetrica circulo = new Circulo(6.5);

        figuras.add(circulo);

        figuras.forEach(figura -> {
            System.out.println("El area del " + figura + " es " + figura.calcularArea());
            System.out.println("El perimetro del " + figura + " es " + figura.calcularPerimetro());
        });
    }
}
