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

        if (sirvioBien) {
            System.out.println("Se sirvió " + dispensadora.cervezaActual.nombre + " a "
                    + dispensadora.temperatura + "°c correctamente. Queda " + dispensadora.cantidadActual);
        } else {
            System.out.println("No se pudo servir cerveza.");
        }

        dispensadora.cambiarCerveza(pilsen);
        boolean sirvioBienPilsen = dispensadora.servir(340);

        if (sirvioBienPilsen) {
            System.out.println("Se sirvió " + dispensadora.cervezaActual.nombre + " a "
                    + dispensadora.temperatura + "°c correctamente. Queda " + dispensadora.cantidadActual);
        } else {
            System.out.println("No se pudo servir cerveza.");
        }
    }
}
