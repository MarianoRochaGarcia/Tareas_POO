package Tarea_7;

public class Pais {
    private String continente;
    private String nombre;
    private int numDeHabitantes;

    public void HacerAcuerdos(){
        System.out.println(nombre +" ha hecho un acuerdo con su pais :)");
    }
    public void DeclararGuerra(){
        System.out.println(nombre + " le ha declarado la guerra a Alemania...");
    }

    public Pais() {
    }

    public Pais(String continente, String nombre, int numDeHabitantes) {
        this.continente = continente;
        this.nombre = nombre;
        this.numDeHabitantes = numDeHabitantes;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumDeHabitantes() {
        return numDeHabitantes;
    }

    public void setNumDeHabitantes(int numDeHabitantes) {
        this.numDeHabitantes = numDeHabitantes;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "continente='" + continente + '\'' +
                ", nombre='" + nombre + '\'' +
                ", numDeHabitantes=" + numDeHabitantes +
                '}';
    }
}
