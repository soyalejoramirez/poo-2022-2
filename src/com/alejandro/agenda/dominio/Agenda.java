package com.alejandro.agenda.dominio;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    private static final int LIMITE_AGENDA = 50;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public boolean crearContacto(String nombre, String apellido, long telefono) {
        if (this.buscarPorNumero(telefono) == null && this.contactos.size() < LIMITE_AGENDA) {
            Contacto contactoAAgregar = new Contacto(nombre, apellido, telefono);
            this.contactos.add(contactoAAgregar);
//            this.contactos.add(new Contacto(nombre, apellido, telefono));
        }

        return false;
    }

    public void eliminarContacto(long telefono) {
        Contacto contactoAEliminar = this.buscarPorNumero(telefono);

        if (contactoAEliminar != null) {
            this.contactos.remove(contactoAEliminar);
        }

//        this.contactos.removeIf(contacto -> contacto.getNumero() == telefono);
    }

    public List<Contacto> buscarPorNombre(String nombreABuscar) {
        return null;
    }

    public List<Contacto> buscarPorApellido(String apellidoABuscar) {
        return null;
    }

    public Contacto buscarPorNumero(long numeroABuscar) {
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
        return true;
    }

    public List<Contacto> ordenar() {
        return null;
    }
}
