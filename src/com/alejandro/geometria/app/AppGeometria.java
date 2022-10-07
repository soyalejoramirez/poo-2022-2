package com.alejandro.geometria.app;

import com.alejandro.geometria.dominio.Circulo;
import com.alejandro.geometria.dominio.Cuadrado;
import com.alejandro.geometria.dominio.FiguraGeometrica;
import com.alejandro.geometria.dominio.Triangulo;
import com.alejandro.geometria.dominio.TrianguloEquilatero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppGeometria {
    public static void main(String[] args) {
        FiguraGeometrica figura1 = new Circulo(25);
        Triangulo triangulo = new TrianguloEquilatero(20, 22);
        Cuadrado cuadrado = new Cuadrado(4, 3.7);

        List<FiguraGeometrica> figuras = new ArrayList<>(Arrays.asList(figura1, triangulo, cuadrado));

        figuras.forEach(figuraGeometrica -> {
            System.out.println("\nCalculando " + figuraGeometrica.toString());
            System.out.println("Area: " + figuraGeometrica.calcularArea());
            System.out.println("Perimetro: " + figuraGeometrica.calcularPerimetro());
        });
    }
}
