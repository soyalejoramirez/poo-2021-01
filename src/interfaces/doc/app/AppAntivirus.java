package interfaces.doc.app;

import interfaces.doc.dominio.Antivirus;
import interfaces.doc.dominio.Documento;
import interfaces.doc.dominio.DocumentoPDF;
import interfaces.doc.dominio.DocumentoWord;
import interfaces.doc.dominio.Juego;
import interfaces.doc.dominio.Nevera;
import interfaces.doc.dominio.ValidacionVirus;
import interfaces.doc.dominio.Video;

import java.util.Arrays;
import java.util.List;

public class AppAntivirus {
    public static void main(String[] args) {
        Antivirus mcafee = new Antivirus("McAfee");

        DocumentoPDF pdf = new DocumentoPDF("contrato.pdf", 15.2, true);
        DocumentoWord word = new DocumentoWord("reforma.docx", 358.3, 2791);
        Video video = new Video("mp4", 254);
        Juego juego = new Juego("Age of Empires", "dificil");
        Nevera nevera = new Nevera("LG");

        List<ValidacionVirus> cosas = Arrays.asList(pdf, word, video, juego, nevera);

        mcafee.escanear(cosas);
    }
}
