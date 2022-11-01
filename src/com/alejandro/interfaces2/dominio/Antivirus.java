package com.alejandro.interfaces2.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Antivirus {
    private List<Archivo> archivosAExaminar;

    public Antivirus() {
        this.archivosAExaminar = new ArrayList<>();
    }

    public void agregar(Archivo arch) {
        this.archivosAExaminar.add(arch);
    }

    public void escanear() {
        System.out.println("Iniciando la busqueda de virus");
        AtomicInteger virusEncontrados = new AtomicInteger();

        this.archivosAExaminar.forEach(archivo -> {
            if (archivo instanceof Viruseable) {
                if (((Viruseable) archivo).tieneVirus()) {
                    virusEncontrados.getAndIncrement();
                    System.out.println("'" + archivo.getNombre() + "' tiene virus ☠");
                }
            } else {
                System.out.println("No se pudo escanear '" + archivo.getNombre() + "'");
            }
        });

        System.out.println("Termina la busqueda de virus. Se encontraron " + virusEncontrados + " virus.");
    }
}
