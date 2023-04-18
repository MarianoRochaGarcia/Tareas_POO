package Herencia;

import java.util.Scanner;

public class Automovil extends Vehiculo{

    private String placa;
    private String tipoDeMotor;
    private String capacidadTanque;

    public Automovil() {
    }

    public Automovil(String tipoDeVehiculo, String color, int numeroRuedas, String placa, String tipoDeMotor, String capacidadTanque) {
        super(tipoDeVehiculo, color, numeroRuedas);
        this.placa = placa;
        this.tipoDeMotor = tipoDeMotor;
        this.capacidadTanque = capacidadTanque;
    }

    public void Encender(){

        System.out.println("El automovil esta encendido...");
    }

    public void Apagar(){

        System.out.println("El auto se ha apagado...");
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "placa='" + placa + '\'' +
                ", tipoDeMotor='" + tipoDeMotor + '\'' +
                ", capacidadTanque='" + capacidadTanque + '\'' +
                '}';
    }
}
