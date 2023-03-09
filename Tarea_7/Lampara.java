package Tarea_7;

public class Lampara {
    private String Amperaje;
    private String marca;
    private int tamañoEnCentimetros;

    public void Iluminar(){
        System.out.println("La lampara esta encendida...");
    }
    public void Apagarse(){
        System.out.println("La lampara se ha apagado...");
    }

    public Lampara() {
    }

    public Lampara(String amperaje, String marca, int tamañoEnCentimetros) {
        Amperaje = amperaje;
        this.marca = marca;
        this.tamañoEnCentimetros = tamañoEnCentimetros;
    }

    public String getAmperaje() {
        return Amperaje;
    }

    public void setAmperaje(String amperaje) {
        Amperaje = amperaje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamañoEnCentimetros() {
        return tamañoEnCentimetros;
    }

    public void setTamañoEnCentimetros(int tamañoEnCentimetros) {
        this.tamañoEnCentimetros = tamañoEnCentimetros;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "Amperaje='" + Amperaje + '\'' +
                ", marca='" + marca + '\'' +
                ", tamañoEnCentimetros=" + tamañoEnCentimetros +
                '}';
    }
}
