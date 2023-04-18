package Herencia;

public class Taxi extends Vehiculo{

    private int numeroTaxi;
    private String idPermiso;
    private String nombreConductorAsignado;

    public void tomarViaje(){

        System.out.println("El taxi numero " + numeroTaxi + " ha tomado tu viaje...");
    }
    public void iniciarViaje(){

        System.out.println("El conductor de nombre " + nombreConductorAsignado + " ha iniciado tu viaje...");
    }

    public Taxi() {
    }

    public Taxi(String tipoDeVehiculo, String color, int numeroRuedas, int numeroTaxi, String idPermiso, String nombreConductorAsignado) {
        super(tipoDeVehiculo, color, numeroRuedas);
        this.numeroTaxi = numeroTaxi;
        this.idPermiso = idPermiso;
        this.nombreConductorAsignado = nombreConductorAsignado;
    }

    public int getNumeroTaxi() {
        return numeroTaxi;
    }

    public void setNumeroTaxi(int numeroTaxi) {
        this.numeroTaxi = numeroTaxi;
    }

    public String getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(String idPermiso) {
        this.idPermiso = idPermiso;
    }

    public String getNombreConductorAsignado() {
        return nombreConductorAsignado;
    }

    public void setNombreConductorAsignado(String nombreConductorAsignado) {
        this.nombreConductorAsignado = nombreConductorAsignado;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "numeroTaxi=" + numeroTaxi +
                ", idPermiso='" + idPermiso + '\'' +
                ", nombreConductorAsignado='" + nombreConductorAsignado + '\'' +
                '}';
    }
}
