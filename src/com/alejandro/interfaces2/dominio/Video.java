package com.alejandro.interfaces2.dominio;

public class Video implements Viruseable {
    private String nombre;
    private int calidad;

    public Video(String nombre, int calidad) {
        this.nombre = nombre;
        this.calidad = calidad;
    }

    @Override
    public boolean tieneVirus() {
        return this.calidad < 280;
    }

    @Override
    public String nombre() {
        return this.nombre;
    }
}
