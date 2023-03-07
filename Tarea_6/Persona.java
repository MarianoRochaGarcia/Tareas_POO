package Tarea_6;

public class Persona {
    private int edad;
    private double estatura;
    private String nombre;

    public void Saludad(){
        System.out.println("Hola mi nombre es " + nombre + "como estas ?");
    }
    public void Caminar(){
        System.out.println(nombre + " se ecnintra caminando...");
    }
    public void Comer(){
        System.out.println(nombre + " se encuentra comiendo...");
    }

    public Persona() {
    }

    public Persona(int edad, double estatura, String nombre) {
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", estatura=" + estatura +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
