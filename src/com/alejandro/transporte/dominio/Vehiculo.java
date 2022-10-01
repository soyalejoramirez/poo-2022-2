package com.alejandro.transporte.dominio;

public class Vehiculo {
    protected long serial;
    protected String marca;
    protected String modelo;
    protected int capacidad;
    protected String color;

    public long getSerial() {
        return serial;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
