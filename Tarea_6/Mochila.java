package Tarea_6;

public class Mochila {
    private String color;
    private String marca;
    private int capacidad;

    public void GuadarCosas(){
        System.out.println("Su mochila de marca " + marca + " ahora contiene sus cosas dentro...");
    }
    public void SacarCosas(){
        System.out.println("Su mochila de marca " + marca + " ahora esta vacia...");
    }
    public void CansarEslpalda(){
        System.out.println("Su mochila de marca " + marca + " esta bastante pesada, sera mejor que descanse un poco su esplada");
    }

    public Mochila() {
    }

    public Mochila(String color, String marca, int capacidad) {
        this.color = color;
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mochila{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
