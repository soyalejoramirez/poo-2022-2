package com.alejandro.dispensador.dominio;

public class Cerveza {
    public String nombre;
    public String marca;
    public double tempRecomendada;

    public Cerveza(String nombre, double tempRecomendada) {
        this.nombre = nombre;
        this.tempRecomendada = tempRecomendada;
    }
}
