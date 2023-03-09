package Tarea_7;

public class Gato {
    private String nombre;
    private String color;
    private int edad;
    public void Ronronear(){
        System.out.println(nombre +" te esta ronroneando, te quiere <3");
    }
    public void arañar(){
        System.out.println(nombre +" te acaba de arañar, lo hiciste enojar... ");
    }

    public Gato() {
    }

    public Gato(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                '}';
    }
}
