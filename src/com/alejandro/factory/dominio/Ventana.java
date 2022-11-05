package com.alejandro.factory.dominio;

import com.alejandro.factory.dominio.excepcion.AlertaNoImplementadaException;

public class Ventana {

    public void mostrarAlerta(String mensaje) {
        IAlerta alerta  = null;
        String  os      = System.getProperty("os.name");
        //String  os      = "Java";

        switch (os) {
            case "Windows 7":
                alerta = new AlertaWindows();
                break;
            case "Java":
                alerta = new AlertaJava();
                break;
            default:
                throw new AlertaNoImplementadaException("No es posible mostrar alerta para " + os);
        }

        alerta.mostrar(mensaje);
    }
}
