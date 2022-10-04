package com.alejandro.geometria.dominio;

public class Cuadrado extends FiguraGeometrica {
    private double lado1;
    private double lado2;

    @Override
    public double calcularArea() {
        return this.lado1 * this.lado2;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * this.lado1) + (2 * this.lado2);
    }
}
