package com.alejandro.factory.dominio;

public class AlertaJava implements IAlerta {
    @Override
    public void mostrar(String mensaje) {
        System.out.println(mensaje);
    }
}
