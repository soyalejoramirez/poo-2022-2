package com.alejandro.interfaces2.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Antivirus {
    private List<Viruseable> elementosAExaminar;

    public Antivirus() {
        this.elementosAExaminar = new ArrayList<>();
    }

    public void agregar(Viruseable elemento) {
        this.elementosAExaminar.add(elemento);
    }

    public void escanear() {
        System.out.println("Iniciando la busqueda de virus");
        AtomicInteger virusEncontrados = new AtomicInteger();

        this.elementosAExaminar.forEach(elem -> {
            if (elem.tieneVirus()) {
                virusEncontrados.getAndIncrement();
                System.out.println("'" + elem.nombre() + "' tiene virus ☠");
            }
        });

        System.out.println("Termina la busqueda de virus. Se encontraron " + virusEncontrados + " virus.");
    }
}
