package com.alejandro.geometria.dominio;

public class TrianguloEquilatero extends Triangulo {
    private double base;
    private double altura;

    public TrianguloEquilatero(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public String toString() {
        return "Triangulo equilatero";
    }
}
