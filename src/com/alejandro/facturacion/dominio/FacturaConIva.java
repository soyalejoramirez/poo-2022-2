package com.alejandro.facturacion.dominio;

import com.alejandro.banco.dominio.Persona;

public class FacturaConIva extends Factura {
    private double iva;

    public FacturaConIva(long valor, Persona persona, double iva) {
        super(valor, persona);
        this.iva = iva;
    }

    @Override
    public long calcularTotal() {
        return super.valor + this.calcularIva();
    }

    public long calcularIva() {
        return (long) (super.valor * this.iva);
    }
}
