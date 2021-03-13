package taller.punto1.dominio;

public class Estudiante {
    private String identificacion;
    private String nombre;
    private int semestreActual;
    private char genero;
    private Nota nota;

    public Estudiante(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public Estudiante(String identificacion, String nombre, int semestreActual) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.semestreActual = semestreActual;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestreActual() {
        return semestreActual;
    }

    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }
}
