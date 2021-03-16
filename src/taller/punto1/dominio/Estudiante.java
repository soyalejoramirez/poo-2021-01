package taller.punto1.dominio;

public class Estudiante {
    public static final int CUPOS = 6;
    private static int nroEstudiantesCreados;

    private String identificacion;
    private String nombre;
    private int semestreActual;
    private char genero;
    private Nota nota;

    private Estudiante(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        nroEstudiantesCreados++;
    }

    private Estudiante(String identificacion, String nombre, int semestreActual) {
        this(identificacion, nombre);
        this.semestreActual = semestreActual;
    }

    public static Estudiante matricular(String identificacion, String nombre) {
        if (nroEstudiantesCreados < CUPOS) {
            Estudiante est = new Estudiante(identificacion, nombre);
            return est;
        } else {
            System.out.println("No se pueden crear más objetos. Cupo lleno. " + nombre);
            return null;
        }
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

    public static int getNroEstudiantesCreados() {
        return nroEstudiantesCreados;
    }

    public static void setNroEstudiantesCreados(int nroEstudiantesCreados) {
        Estudiante.nroEstudiantesCreados = nroEstudiantesCreados;
    }
}
