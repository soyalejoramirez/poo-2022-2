package com.alejandro.interfaces.dominio;

public abstract class Celular implements Activable {
    private boolean encendido;
    private long numero;
    private String marca;
    private Persona propietario;

    public Celular(String marca) {
        this.marca = marca;
    }

    public Celular(String marca, Persona propietario) {
        this.marca = marca;
        this.propietario = propietario;
    }

    @Override
    public void encender() {
        this.encendido = true;
    }

    @Override
    public void apagar() {
        this.encendido = false;
    }

    public String getMarca() {
        return marca;
    }
}
