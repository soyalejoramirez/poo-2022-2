package com.alejandro.banco.dominio;

public class CuentaBancaria {
    private Persona propietario;
    private String tipo;
    private int numero;
    private Banco banco;
    private String clave;
    private double saldo;
    private boolean activa;

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
        return propietario.getNombre() + " tu saldo actual es " + saldo;
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

    public Persona getPropietario() {
        return propietario;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumero() {
        return numero;
    }

    public Banco getBanco() {
        return banco;
    }

    public String getClave() {
        return clave;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}

















