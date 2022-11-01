package com.alejandro.interfaces2.app;

import com.alejandro.interfaces2.dominio.Antivirus;
import com.alejandro.interfaces2.dominio.DocumentoPDF;
import com.alejandro.interfaces2.dominio.DocumentoWord;
import com.alejandro.interfaces2.dominio.Video;

public class AppAntivirus {
    public static void main(String[] args) {
        Antivirus antivirus = new Antivirus();

        antivirus.agregar(new DocumentoWord("tesis.docx", true));
        antivirus.agregar(new DocumentoWord("hoja de vida.docx", false));
        antivirus.agregar(new DocumentoWord("despido.docx", true));
        //antivirus.agregar(new DocumentoPDF("despido.pdf", 10));
        antivirus.agregar(new Video("esperanza.mp4", 140));

        antivirus.escanear();
    }
}
