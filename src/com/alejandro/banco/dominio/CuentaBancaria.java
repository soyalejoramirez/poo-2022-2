package com.alejandro.banco.dominio;

public class CuentaBancaria {
    public Persona propietario;
    public String tipo;
    public int numero;
    public Banco banco;
    public String clave;
    public double saldo;
    public boolean activa;

    public CuentaBancaria(Persona propietario, String tipo, int numero) {
        this.propietario = propietario;
        this.tipo = tipo;
        this.numero = numero;
        this.saldo = 0; // Sobraría porque el valor por defecto de un double es 0.
        this.activa = true;
    }

    public boolean consignar(double montoAConsignar) {
        if (this.activa == true) {
            if (montoAConsignar > 0) {
                this.saldo += montoAConsignar;
                return true;
            } else {
                System.out.println("El monto a consignar debe ser mayor a cero.");
                return false;
            }
        } else {
            System.out.println("La cuenta no está activa");
            return false;
        }
    }

    public boolean retirar(double montoARetirar) {
        if (activa == true) {
            if (montoARetirar <= this.saldo && this.saldo > 0) {
                this.saldo -= montoARetirar;
                return true;
            } else {
                System.out.println("El saldo es insuficiente");
                return false;
            }
        } else {
            System.out.println("La cuenta debe estar activar para retirar.");
            return false;
        }
    }

    public String consultarSaldoActual() {
        return propietario.nombre + " tu saldo actual es " + saldo;
    }

    public boolean transferir(CuentaBancaria destino, double monto) {
        boolean retiroBien = this.retirar(monto);

        if (retiroBien == true) {
            boolean consignoBienADestino = destino.consignar(monto);

            if (consignoBienADestino) {
                return true;
            } else {
                this.saldo += monto;
                System.out.println("Se retiró pero no se consignó a la cuenta destino. Operación fallida.");
                return false;
            }
        }

        return false;
    }
}

















