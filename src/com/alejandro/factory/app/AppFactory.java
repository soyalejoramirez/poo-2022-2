package com.alejandro.factory.app;

import com.alejandro.factory.dominio.Ventana;

public class AppFactory {
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.mostrarAlerta("Chao 2022-02");
    }
}
