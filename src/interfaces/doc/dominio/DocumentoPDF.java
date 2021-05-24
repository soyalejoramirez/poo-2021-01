package interfaces.doc.dominio;

public class DocumentoPDF extends Documento {
    private boolean firmado;

    public DocumentoPDF(String nombre, double peso, boolean firmado) {
        super(nombre, peso);
        this.firmado = firmado;
    }

    public boolean isFirmado() {
        return firmado;
    }

    @Override
    public boolean buscarVirus() {
        return !firmado;
    }
}
