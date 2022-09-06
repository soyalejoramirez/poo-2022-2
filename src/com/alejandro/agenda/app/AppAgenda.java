package com.alejandro.agenda.app;

import com.alejandro.agenda.dominio.Agenda;
import com.alejandro.agenda.dominio.Contacto;

import java.util.List;

public class AppAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.crearContacto("Pedro", "Zuluaga", 3002547895l);
        agenda.crearContacto("Pedro", "Perez", 3052547895l);
        agenda.crearContacto("Pepe", "Ramirez", 3102547895l);
        agenda.crearContacto("Alejandro", "Ramirez", 3108847895l);
        agenda.crearContacto("Pilar", "Gutierrez", 3002547895l);
        agenda.crearContacto("Zoraida", "Dell", 3102547800l);

        agenda.ordenar();

        List<Contacto> contactosFiltrados = agenda.buscarPorApellido("ramirez");

        contactosFiltrados.forEach(c -> System.out.println(c.getNombre() + " " + c.getApellido()));
    }
}
