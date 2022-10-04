package com.alejandro.geometria.dominio;

public class Circulo extends FiguraGeometrica {
    private double radio;

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }
}
