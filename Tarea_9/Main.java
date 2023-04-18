package Herencia;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("Avion", "Rojo", 3);
        Automovil automovil1 = new Automovil("Carro", "Azul", 3, "ANL58", "Doble banda", "60L");
        Taxi taxi1 = new Taxi("Tsuru", "Amarillo", 4, 374697, "APNL#63", "Rocha");

        System.out.println(vehiculo1);
        System.out.println(automovil1);
        System.out.println(taxi1);
        System.out.println("\n\n");

        //Metodos de vehiculo
        vehiculo1.Avanzar();
        vehiculo1.Retroceder();
        System.out.println("\n\n");

        //Metodos de automovil
        automovil1.Avanzar();
        automovil1.Retroceder();
        automovil1.Apagar();
        automovil1.Encender();
        System.out.println("\n\n");

        //Metodos de taxi
        taxi1.Avanzar();
        taxi1.Retroceder();;
        taxi1.tomarViaje();
        taxi1.iniciarViaje();
        System.out.println("\n\n");
    }
}