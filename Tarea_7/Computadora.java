package Tarea_7;

import java.time.Instant;

public class Computadora {
    private String marca;
    private double tamPanPulgadas;
    private String tipoDePantalla;

    public void Encender(){
        System.out.println("La pantalla ahora esta encendida");
    }
    public void MostrarHora(){
        Instant instant = Instant.now();
        System.out.println("La hora actual es " + instant);
    }

    public Computadora() {
    }

    public Computadora(String marca, double tamPanPulgadas, String tipoDePantalla) {
        this.marca = marca;
        this.tamPanPulgadas = tamPanPulgadas;
        this.tipoDePantalla = tipoDePantalla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamPanPulgadas() {
        return tamPanPulgadas;
    }

    public void setTamPanPulgadas(double tamPanPulgadas) {
        this.tamPanPulgadas = tamPanPulgadas;
    }

    public String getTipoDePantalla() {
        return tipoDePantalla;
    }

    public void setTipoDePantalla(String tipoDePantalla) {
        this.tipoDePantalla = tipoDePantalla;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", tamPanPulgadas=" + tamPanPulgadas +
                ", tipoDePantalla='" + tipoDePantalla + '\'' +
                '}';
    }
}
