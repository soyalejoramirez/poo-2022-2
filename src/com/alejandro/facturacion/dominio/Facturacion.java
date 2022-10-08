package com.alejandro.facturacion.dominio;

import com.alejandro.banco.dominio.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Facturacion {
    private static final double IVA_19 = 0.19;
    private List<Factura> facturas;

    public Facturacion() {
        this.facturas = new ArrayList<>();
    }

    public void crearFactura(Persona persona, long valor) {
        Factura factura = null;

        if (persona.getNombre().toUpperCase().startsWith("A")) {
            factura = new FacturaSinIva(valor, persona);
        } else {
            factura = new FacturaConIva(valor, persona, IVA_19);
        }

        this.facturas.add(factura);
    }

    public List<String> obtenerInfoFacturas(){
        return this.facturas.stream().map(fac -> {
            return "Factura #" + fac.numero + " a nombre de " + fac.persona.getNombre() + " - $" + fac.calcularTotal() + "\n";
        }).collect(Collectors.toList());
    }

    public long obtenerTotalFacturas() {
        return this.facturas.stream().mapToLong(fac -> fac.calcularTotal()).sum();
    }
}
