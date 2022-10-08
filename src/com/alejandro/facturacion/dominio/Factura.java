package com.alejandro.facturacion.dominio;

import com.alejandro.banco.dominio.Persona;

import java.time.LocalDateTime;

public abstract class Factura {
    protected int numero;
    protected LocalDateTime fecha;
    protected long valor;
    protected Persona persona;

    private static int contador = 1;

    public Factura(long valor, Persona persona) {
        this.valor = valor;
        this.persona = persona;
        this.numero = contador++;
        this.fecha = LocalDateTime.now();
    }

    public abstract long calcularTotal();
}
