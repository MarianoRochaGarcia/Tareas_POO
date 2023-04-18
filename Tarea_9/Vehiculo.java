package Herencia;

public class Vehiculo {

    private String tipoDeVehiculo;
    private String color;
    private int numeroRuedas;

    public void Avanzar(){

        System.out.println("El vehiculo esta avanzando...");
    }
    public void Retroceder() {

        System.out.println("El vehiculo esta retrocediendo...");
    }

    public Vehiculo() {
    }

    public Vehiculo(String tipoDeVehiculo, String color, int numeroRuedas) {
        this.tipoDeVehiculo = tipoDeVehiculo;
        this.color = color;
        this.numeroRuedas = numeroRuedas;
    }

    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipoDeVehiculo='" + tipoDeVehiculo + '\'' +
                ", color='" + color + '\'' +
                ", numeroRuedas=" + numeroRuedas +
                '}';
    }
}
