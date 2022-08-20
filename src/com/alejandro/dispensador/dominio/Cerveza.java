package com.alejandro.dispensador.dominio;

public class Cerveza {
    private String nombre;
    private String marca;
    private double tempRecomendada;

    public Cerveza(String nombre, double tempRecomendada) {
        this.nombre = nombre;
        this.tempRecomendada = tempRecomendada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(double tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }
}
