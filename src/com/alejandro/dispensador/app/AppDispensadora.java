package com.alejandro.dispensador.app;

import com.alejandro.dispensador.dominio.Cerveza;
import com.alejandro.dispensador.dominio.Dispensadora;

public class AppDispensadora {
    public static void main(String[] args) {
        Cerveza clubNegra = new Cerveza("Club Colombia Negra", -4);
        Cerveza pilsen = new Cerveza("Pilsen", 2);

        Dispensadora dispensadora = new Dispensadora("Black and Decker", 1000);
        dispensadora.cambiarCerveza(clubNegra);
        boolean sirvioBien = dispensadora.servir(250);

        dispensadora.getCervezaActual().setTempRecomendada(-5);

        if (sirvioBien) {
            System.out.println("Se sirvió " + dispensadora.getCervezaActual().getNombre() + " a "
                    + dispensadora.getTemperatura() + "°c correctamente. Queda " + dispensadora.getCantidadActual());
        } else {
            System.out.println("No se pudo servir cerveza.");
        }

        dispensadora.cambiarCerveza(pilsen);
        boolean sirvioBienPilsen = dispensadora.servir(340);

        if (sirvioBienPilsen) {
            System.out.println("Se sirvió " + dispensadora.getCervezaActual().getNombre() + " a "
                    + dispensadora.getTemperatura() + "°c correctamente. Queda " + dispensadora.getCantidadActual());
        } else {
            System.out.println("No se pudo servir cerveza.");
        }
    }
}
