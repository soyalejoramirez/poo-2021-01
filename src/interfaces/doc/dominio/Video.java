package interfaces.doc.dominio;

public class Video implements ValidacionVirus {
    private String extension;
    private int calidad;

    public Video(String extension, int calidad) {
        this.extension = extension;
        this.calidad = calidad;
    }

    @Override
    public boolean buscarVirus() {
        return calidad < 128;
    }

    @Override
    public String getNombre() {
        return "Video";
    }
}
