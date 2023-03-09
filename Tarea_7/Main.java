package Tarea_7;

public class Main {
    public static void main(String[] args) {

        Balon balon1 = new Balon("Mediano", "Rojo", "Plastico");
        Computadora computadora1 = new Computadora("Samsung", 15.2, "OLED");
        CuboDeRubik cuboDeRubik1 = new CuboDeRubik(5.6, "GAN", "Plastico");
        Gato gato1 = new Gato("Morgana", "Blanca", 2);
        Giroscopio giroscopio1 = new Giroscopio("Aluminio", "Azul", "Grande");
        Lampara lampara1 = new Lampara("15V", "LG", 20);
        Libro libro1 = new Libro("ViniPiel", "Porrua", 254);
        Pais pais1 = new Pais("Americano", "Argentina", 45810000);

        System.out.println(balon1);
        balon1.Rodar();
        System.out.println();

        System.out.println(computadora1);
        computadora1.MostrarHora();
        System.out.println();

        System.out.println(cuboDeRubik1);
        cuboDeRubik1.GirarEnHorizontal();
        System.out.println();

        System.out.println(gato1);
        gato1.Ronronear();
        System.out.println();

        System.out.println(giroscopio1);
        giroscopio1.Orientar();
        System.out.println();

        System.out.println(lampara1);
        lampara1.Iluminar();
        System.out.println();

        System.out.println(libro1);
        libro1.SigPagina();
        System.out.println();

        System.out.println(pais1);
        pais1.DeclararGuerra();
        System.out.println();
    }
}
