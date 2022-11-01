package com.alejandro.interfaces2.dominio;

public abstract class Documento {
    private String nombre;

    public Documento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
