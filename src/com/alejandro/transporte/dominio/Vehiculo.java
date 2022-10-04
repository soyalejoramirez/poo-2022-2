package com.alejandro.transporte.dominio;

public class Vehiculo {
    protected long serial;
    protected String marca;
    protected String modelo;
    protected int capacidad;
    protected String color;
    protected double velocidad;

    public Vehiculo(long serial, String marca) {
        this.serial = serial;
        this.marca = marca;
    }

    public void acelerar() {
        System.out.println("El vehiculo " + this.marca + " está acelerando");
    }

    public void frenar() {
        System.out.println("El vehiculo está frenando");
    }

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
