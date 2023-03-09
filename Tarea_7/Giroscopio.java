package Tarea_7;

public class Giroscopio {
    private String material;
    private String color;
    private String tamaño;

    public void Girar(){
        System.out.println("El giroscopio esta girando...");
    }
    public void Orientar(){
        System.out.println("El giroscopio ha detecato la orientacion del objeto...");
    }

    public Giroscopio() {
    }

    public Giroscopio(String material, String color, String tamaño) {
        this.material = material;
        this.color = color;
        this.tamaño = tamaño;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", tamaño='" + tamaño + '\'' +
                '}';
    }
}
