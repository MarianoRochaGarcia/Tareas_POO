package Excepciones2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        LeerArchivo lectura = new LeerArchivo();
        lectura.metodoUno("datos.txt");
    }
}