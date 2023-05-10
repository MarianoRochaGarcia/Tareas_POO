package Excepciones2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public void leer(String ruta){
        try{

            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String line = "";
            while((line = reader.readLine()) != null){
                System.out.println("Info: " + line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void metodoUno(String ruta) throws  IOException{
        this.metodo2(ruta);
    }
    public void metodo2(String ruta) throws IOException{
        this.leer(ruta);
    }
}
