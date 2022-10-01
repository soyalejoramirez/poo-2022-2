package com.alejandro.transporte.app;

import com.alejandro.transporte.dominio.BiciMTB;
import com.alejandro.transporte.dominio.BiciRuta;
import com.alejandro.transporte.dominio.Bicicleta;
import com.alejandro.transporte.dominio.Carro;
import com.alejandro.transporte.dominio.Taxi;
import com.alejandro.transporte.dominio.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class AppVehiculos {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new BiciMTB());
        vehiculos.add(new Bicicleta());
        vehiculos.add(new BiciRuta());
        vehiculos.add(new Vehiculo());
        vehiculos.add(new Taxi());

        vehiculos.forEach(System.out::println);
    }
}
