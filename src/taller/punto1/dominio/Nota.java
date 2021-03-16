package taller.punto1.dominio;

import java.util.ArrayList;
import java.util.List;

public class Nota {
    public static final double PORC_PARCIAL = 0.3;
    public static final double PORC_FINAL = 0.3;
    public static final double PORC_SEGUIMIENTO = 0.4;

    private double notaParcial;
    private double notaFinal;
    private List<Double> notasSeguimiento;
    private Asignatura materia;

    public Nota(Asignatura materia) {
        this.materia = materia;
        this.notasSeguimiento = new ArrayList<>();
    }

    private double calcularSeguimiento() {
        int nroNotasSeguimiento = this.notasSeguimiento.size();
        double sumaNotasSeguimiento = 0;

        for (Double nota : this.notasSeguimiento) {
            sumaNotasSeguimiento += nota;
        }

        return sumaNotasSeguimiento / nroNotasSeguimiento;
    }

    public double calcularDefinitiva() {
        double parcialDef = this.notaParcial * PORC_PARCIAL;
        double finalDef = this.notaFinal * PORC_FINAL;
        double seguimientoDef = calcularSeguimiento() * PORC_SEGUIMIENTO;

        return parcialDef + finalDef + seguimientoDef;
    }

    public double getNotaParcial() {
        return notaParcial;
    }

    public void setNotaParcial(double notaParcial) {
        this.notaParcial = notaParcial;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public List<Double> getNotasSeguimiento() {
        return notasSeguimiento;
    }

    public void setNotasSeguimiento(List<Double> notasSeguimiento) {
        this.notasSeguimiento = notasSeguimiento;
    }

    public Asignatura getMateria() {
        return materia;
    }
}
