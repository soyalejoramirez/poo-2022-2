package com.alejandro.geometria.dominio;

public class Cuadrado extends FiguraGeometrica {
    private double lado1;
    private double lado2;

    public Cuadrado(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return this.lado1 * this.lado2;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * this.lado1) + (2 * this.lado2);
    }

    @Override
    public String toString() {
        return "Cuadrado";
    }
}
