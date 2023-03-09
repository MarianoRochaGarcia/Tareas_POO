package Tarea_7;

public class Balon {
    private String tamaño;
    private String color;
    private String material;

    public void Rodar(){
        System.out.println("El balon esta rodando...");
    }
    public void Golpear(){
        System.out.println("El balon acaba de golpear a alguien :( ...");
    }

    public Balon() {
    }

    public Balon(String tamaño, String color, String material) {
        this.tamaño = tamaño;
        this.color = color;
        this.material = material;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "tamaño='" + tamaño + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
