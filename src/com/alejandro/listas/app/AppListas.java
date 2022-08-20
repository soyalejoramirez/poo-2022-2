package com.alejandro.listas.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppListas {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Hector");
        nombres.add("Natalia");
        nombres.add("Pedro");
        nombres.add("Sofia");

        nombres.forEach(nombre -> System.out.println("Funcional " + nombre));

        for (String name : nombres) {
            System.out.println("El nombre foreach es " + name);
        }

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("El nombre es " + nombres.get(i));
        }
    }
}
