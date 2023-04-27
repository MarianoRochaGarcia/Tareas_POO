public class DriverVehiculo {
    public static void main(String[] args) {

        Camion camion = new Camion("Diesel", 3);
        System.out.println(camion);
        System.out.println(camion.encender());
        camion.avanzar();
        System.out.println(camion.apagar());
        camion.frenar();

        System.out.println("---MOTOCICLETA---");
        Motocicleta motocicleta = new Motocicleta(150,"Yamaha");
        System.out.println(motocicleta);
        motocicleta.encender();
        motocicleta.avanzar();
        motocicleta.hacerCaballito();
        motocicleta.frenar();
        motocicleta.apagar();

    }
}