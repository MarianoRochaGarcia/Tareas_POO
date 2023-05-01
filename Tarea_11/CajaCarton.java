package Genericos;

import java.util.Arrays;

public class CajaCarton<T> {

    public static final int CAPACIDAD = 10;
    private T[] content;

    public CajaCarton(){


    }

    public CajaCarton(T[] content){

        this.content = content;

    }

    @Override
    public String toString() {
        return "Genericos.CajaCarton{" +
                "content=" + Arrays.toString(content) +
                '}';
    }

    public void add (int pos, T objeto){
        content[pos] = objeto;
    }

    public T get(int pos){
        return content[pos];
    }
}
