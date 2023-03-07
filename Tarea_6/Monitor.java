package Tarea_6;

public class Monitor {
    private float pulgadas;
    private String marca;
    private String tipoDePantalla;
    public void encender(){
        System.out.println("El monitor de marca " + marca + " ha encendido...");
    }
    public void mostrarPantalla(){
        System.out.println("Su monitor de marca " + marca +" le desea un buen dia :)");
    }
    public void apagar(){
        System.out.println("Su monitor de marca " + marca + "ahora esta apagado...");
    }

    public Monitor() {
    }

    public Monitor(float pulgadas, String marca, String tipoDePantalla) {
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.tipoDePantalla = tipoDePantalla;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDePantalla() {
        return tipoDePantalla;
    }

    public void setTipoDePantalla(String tipoDePantalla) {
        this.tipoDePantalla = tipoDePantalla;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "pulgadas=" + pulgadas +
                ", marca='" + marca + '\'' +
                ", tipoDePantalla='" + tipoDePantalla + '\'' +
                '}';
    }
}
