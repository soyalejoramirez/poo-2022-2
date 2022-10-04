package com.alejandro.transporte.dominio;

import java.util.Random;

public class Bicicleta extends Vehiculo {
    private double cadencia;
    private double talla;

    public Bicicleta(long serial, String marca) {
        super(serial, marca);
    }

    @Override
    public void acelerar() {
        System.out.println("La 🚲 " + this.marca + " - " + this.serial + " está acelerando");
        cadencia = new Random().nextInt(10);
    }

    public void imprimirCadencia() {
        System.out.println("La cadencia es " + cadencia);
    }

    public double getCadencia() {
        return cadencia;
    }

    public double getTalla() {
        return talla;
    }
}
