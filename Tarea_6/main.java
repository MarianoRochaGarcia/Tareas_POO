package Tarea_6;

public class main {
    public static void main(String[] args) {

        //Objetos de clase Persona, uno con contructor por defecto y otro sobrecargadp
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(19,1.82,"Mariano");
        //Objetos de clase Automovil, uno con constructor por defecto y otro sobrecagardo
        Automovil automovil1 = new Automovil();
        Automovil automovil2 = new Automovil("BMW", 1982, "Rojo");
        //Objetos de clase Monitor, uno con constructor por defecto y otro sobrecargado
        Monitor monitor1 = new Monitor(15.2F, "Samsung", "OLED");
        Monitor monitor2 = new Monitor();
        //Objetos de clase Mochila, uno con constuctor por defecto y otro cobrecargado
        Mochila mochila1 = new Mochila();
        Mochila mochila2 = new Mochila("Negra", "Vans", 20);

        System.out.println(persona1);
        System.out.println(persona2);
        persona2.Comer();
        System.out.println(automovil1);
        System.out.println(automovil2);
        automovil2.apagar();
        System.out.println(monitor1);
        System.out.println(monitor2);
        monitor2.encender();
        System.out.println(mochila1);
        System.out.println(mochila2);
        mochila2.SacarCosas();
    }
}
