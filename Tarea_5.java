import java.util.Scanner;

public class Tarea_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String entrada = "";
        int i = 1, posCad = 0;


        System.out.println("\nEl programa solo aceptara los digitos 'X', 'O' y '_' y debe ser de 9 caracteres\n");
        System.out.print("Por favor ingresa la cadena: ");
        entrada = in.nextLine();


        if (entrada.length() == 9) { //Se realiza la primera verificacion para saber si la cadena ingresa es del tamaño correcto

            String cadena[] = entrada.split("");

            for (i = 0; i < 8; i++) { //Creamos un bucle para hacer la verificacion de que ningun dato de la cadena sea un caracter no valido

                if (cadena[i].equals("X") || cadena[i].equals("O") || cadena[i].equals("_")) { // Con el metodo equals hacemos la comparacion

                } else {
                    System.out.println("Uno o mas valores de la cadena no son validos");
                    i = 9; // Asignamos el valor de 9 para que no se siga ejecutando el bucle en caso de que un caracter sea incorrecto
                }
            }
            if (i == 8) { // Se asigna el valor de 8 porque en caso de que un caracter de la cadena ingresada sea no valido  en automatico 'i' tomara el
                          //  valor de 9 por tanto no cumplira la condicion

                System.out.println("-----"); // Se imprime la primera fila
                for (int j = 0; j <= 2; j++) {  //Se imprimen las posteriores 3 filas
                    System.out.print("|");
                    for (int k = 0; k <= 2; k++) {
                        System.out.print(cadena[posCad]);
                        posCad++;
                    }
                    System.out.println("|");
                }
                System.out.println("-----"); // Se imprime la ultima fila
            }
        }else{
            System.out.println("El tamaño de la cadena no es valido");
        }
    }
}
