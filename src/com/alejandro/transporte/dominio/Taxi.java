package com.alejandro.transporte.dominio;

public class Taxi extends Carro {
    private String empresa;
    private int nroPasajeros;

    public Taxi(long serial, String marca, String placa) {
        super(serial, marca, placa);
    }

    @Override
    public void acelerar() {
        System.out.println("El taxi acelera");
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNroPasajeros() {
        return nroPasajeros;
    }

    public void setNroPasajeros(int nroPasajeros) {
        this.nroPasajeros = nroPasajeros;
    }
}
