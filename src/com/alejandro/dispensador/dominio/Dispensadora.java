package com.alejandro.dispensador.dominio;

public class Dispensadora {
    public String marca;
    public double capacidad;
    public double cantidadActual;
    public double temperatura;
    public Cerveza cervezaActual;

    public Dispensadora(String marca, double capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.temperatura = -3;
    }

    public boolean servir(double cantidadAServir) {
        if (temperaturaEsValida() && cantidadAServirEsValida(cantidadAServir)) { // tempeturaValida() == true
            this.cantidadActual -= cantidadAServir;
            return true;
        }

        return false;
    }

    public boolean cantidadAServirEsValida(double cantidadAServir) {
        return cantidadAServir > 0 && cantidadAServir <= this.cantidadActual;
    }

    public boolean temperaturaEsValida() {
        return this.temperatura >= -10 && this.temperatura <= 10;
    }

    public boolean cambiarTemperatura(double nuevaTemperatura) {
        if (nuevaTemperatura >= -10 && nuevaTemperatura <= 10) {
            this.temperatura = nuevaTemperatura;
            return true;
        }

        return false;
    }

    public void cambiarCerveza(Cerveza nuevaCerveza) {
        this.vaciar();
        this.cervezaActual = nuevaCerveza;
        this.temperatura = nuevaCerveza.tempRecomendada;
        this.llenar();
    }

    public void llenar() {
        this.cantidadActual = this.capacidad;
    }

    public void vaciar() {
        this.cantidadActual = 0;
    }
}
