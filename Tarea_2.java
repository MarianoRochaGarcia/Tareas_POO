import java.util.Scanner;

public class Tarea_2{

  public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   String datos = "";
   
   System.out.print("Por favor ingresa tu Nombre Profesion País : ");
   datos = in.nextLine();
   
   String datosM = datos.toUpperCase();
   String cadena[] = datosM.split(" ");

   System.out.println("Nombre: " + cadena[0]);
   System.out.println("Profesión: " + cadena[1]);
   System.out.println("Pais: " + cadena[2]);

 }
}