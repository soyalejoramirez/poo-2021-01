package interfaces.doc.dominio;

public class DocumentoWord extends Documento {
    private int nroLineas;

    public DocumentoWord(String nombre, double peso, int nroLineas) {
        super(nombre, peso);
        this.nroLineas = nroLineas;
    }

    public int getNroLineas() {
        return nroLineas;
    }

    @Override
    public boolean buscarVirus() {
        return nroLineas < 1000;
    }
}
