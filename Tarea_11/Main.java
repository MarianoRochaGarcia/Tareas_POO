package Genericos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CajaCarton<String> miCaja = new CajaCarton<>(new String[10]);

        miCaja.add(0, "Hola");
        miCaja.add(1, "Adios");
        miCaja.add(3, "Hi");
        System.out.println(miCaja);

        System.out.println("--------");

        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.add(0,"Hola");
        cajaSin.add(1,"Adios");
        cajaSin.add(2,"Hi");
        System.out.println(cajaSin);

        System.out.println("------Genericos.Comida-------");
        CajaCarton<Comida> cajaComida = new CajaCarton<>(new Comida[10]);
        cajaComida.add(0, new Comida("Yoghurt", true));
        System.out.println(cajaComida.get(0));

        System.out.println("-------");
        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Manzana", false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(2));

        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Zanahoria", false));
        comidas2.add(new Comida("Yoghurt", false));
        comidas2.add(new Comida("Danonino", false));
        comidas2.add(new Comida("Manzana", false));
        comidas2.add(new Comida("Bisteck", false));
        System.out.println(comidas2.get(3));

        comidas.set(2, new Comida("Fresa", false));
        comidas2.add(1, new Comida("Naranja", false));

        System.out.println("-----Final-----");
        for (Comida comida: comidas2) {
            System.out.println(comida);
        }

    }
}
