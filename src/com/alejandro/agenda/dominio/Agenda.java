package com.alejandro.agenda.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda {
    private List<Contacto> contactos;
    private static final int LIMITE_AGENDA = 50;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public boolean crearContacto(String nombre, String apellido, long telefono) {
        if (this.buscar(telefono) == null && this.contactos.size() < LIMITE_AGENDA) {
            Contacto contactoAAgregar = new Contacto(nombre, apellido, telefono);
            this.contactos.add(contactoAAgregar);
            return true;
//            this.contactos.add(new Contacto(nombre, apellido, telefono));
        }
        System.out.println("No se pudo crear el contacto " + nombre);
        return false;
    }

    public void eliminarContacto(long telefono) {
        Contacto contactoAEliminar = buscar(telefono);

        if (contactoAEliminar != null) {
            this.contactos.remove(contactoAEliminar);
        }

//        this.contactos.removeIf(contacto -> contacto.getNumero() == telefono);
    }

    public List<Contacto> buscar(String nombreABuscar) {
        return this.contactos.stream()
                .filter(c -> c.getNombre().toLowerCase().startsWith(nombreABuscar.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Contacto> buscarPorApellido(String apellidoABuscar) {
        return this.contactos.stream()
                .filter(c -> c.getApellido().equalsIgnoreCase(apellidoABuscar))
                .collect(Collectors.toList());
    }

    public Contacto buscar(long numeroABuscar) {
        Contacto contactoBuscado = null;

        for (Contacto contacto : this.contactos) {
            if (contacto.getNumero() == numeroABuscar) {
                contactoBuscado = contacto;
            }
        }

//        Contacto contactoBuscado = this.contactos.stream()
//                                    .filter(contacto -> contacto.getNumero() == numeroABuscar)
//                                    .findFirst()
//                                    .orElse(null);

        return contactoBuscado;
    }

    public boolean cambiarNumero(long numeroViejo, long numeroNuevo) {
        Contacto contactoAModificar = this.buscar(numeroViejo);

        if (contactoAModificar != null) {
            contactoAModificar.setNumero(numeroNuevo);
            return true;
        } else {
            return false;
        }
    }

    public void ordenar() {
        this.contactos.sort(Comparator.comparing(Contacto::getNombre).thenComparing(Contacto::getApellido));
    }

    public List<Contacto> getContactos() {
        return contactos;
    }
}
