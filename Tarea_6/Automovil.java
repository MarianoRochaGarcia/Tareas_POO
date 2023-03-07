package Tarea_6;

public class Automovil {
    private String marca;
    private int modelo;
    private String color;
    public void encender(){
        System.out.println("El carro de marca " + marca +" ha encendido...");
    }
    public void acelerar(){
        System.out.println("El carro de marca " + marca + " ahora se ecuentra en movimiento...");
    }
    public void apagar(){
        System.out.println("El carro de marca " + marca + " ahora esta apagado...");
    }

    public Automovil() {
    }

    public Automovil(String marca, int modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", color=" + color +
                '}';
    }
}
