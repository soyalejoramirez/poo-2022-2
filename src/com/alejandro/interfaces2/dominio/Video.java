package com.alejandro.interfaces2.dominio;

public class Video extends Archivo implements Viruseable {
    private int calidad;

    public Video(String nombre, int calidad) {
        super(nombre);
        this.calidad = calidad;
    }

    @Override
    public boolean tieneVirus() {
        return this.calidad < 280;
    }
}
