package Tarea_8;

import java.util.Scanner;

public class MaquinaDeCafe {
    public int agua = 5000;
    public int cafe = 1000;
    public int crema = 1500;
    public int vasos = 50;
    public void PrepararCafe(){
        int tipoDeCafe;
        Scanner in = new Scanner(System.in);
        int conocerCantidades = 1;
        double cafesServidos = 0;
        int opcionErronea = 0;
        int desicionCantidades;

        for (int i = 0; i < 1; i++) {
            System.out.print("\nPor favor ingresa el tipo de cafe que deseas preparar (Con su respectivo numero) 1- Americano 2-Expresso 3-Capuchino: ");
            tipoDeCafe = in.nextInt();
            vasos--;
            opcionErronea = 0;
            if(tipoDeCafe == 1){
                agua = agua - 180;
                cafe = cafe -15;
            }else if(tipoDeCafe == 2){
                agua = agua-120;
                cafe = cafe - 20;
            }else if(tipoDeCafe == 3){
                agua = agua - 120;
                crema = crema - 70;
                cafe = cafe - 14;
            }else{
                System.out.println("La opcion indicada no es valida");
                opcionErronea = 2;
            }
            if (agua >= 180 && cafe >= 20 && crema >= 70 && vasos >= 1){
                System.out.println("\nLa maquina aun tiene suficientes recursos para seguir preparando Americano, Expreso y Capuchino...");
            }else if(agua >= 180 && cafe >= 15 && crema >= 70 && vasos >= 1){
                System.out.println("\nLa maquina aun tiene suficientes recursos para seguir preparando Americano y Capuchino...");
            } else if (agua >= 120 && crema >= 70 && vasos >= 1) {
                System.out.println("\nLa maquina aun tiene suficientes recursos para seguir preparando Expreso y Capuchino...");
            }else if(agua >= 100 && crema >= 70 && cafe >= 14 && vasos >= 1){
                System.out.println("\nLa maquina aun tiene suficientes recursos para seguir preparando Capuchino...");
            }else{
                System.out.println("\nLa maquina ya no tiene suficientes recursos para seguir preparando cafes...");
                opcionErronea = 2;
                i = 1;
            }
            if (opcionErronea == 0) {
                for (int j = 0; j <= 1; j++) {
                    int desicion;
                    System.out.println("\n¿Desea seguir preparando cafes?");
                    System.out.println("1 = Si 2 = No");
                    System.out.print("Usuario: ");
                    desicion = in.nextInt();
                    if (desicion == 2) {
                        System.out.println("\n¿Estas seguro?");
                        System.out.println("1 = Si | 2 = No");
                        System.out.print("Usuario: ");
                        desicion = in.nextInt();
                        if (desicion == 1) {
                            j = j + 2;
                            cafesServidos = 1;
                        } else if (desicion == 2) {
                            j--;
                        } else {
                            System.out.println("La opcion señalada no existe...");
                            j--;
                        }
                    } else if (desicion == 1) {
                        j++;
                        i--;
                    } else {
                        System.out.println("La opcion señalada no existe...");
                        j--;
                    }
                }
                if (cafesServidos % 3 == 0) {
                    System.out.println("\n¿Desea conocer las cantidades que aun tiene la cafetera?");
                    System.out.println("1 = Si | 2 = No");
                    System.out.print("Usuario: ");
                    desicionCantidades = in.nextInt();
                    if (desicionCantidades == 1){
                        MostrarCantidades();
                    }else if(desicionCantidades == 2){
                        System.out.println("\nDe acuerdo...");
                    }else{
                        System.out.println("La opcion ingresada no es valida");
                    }
                }
                cafesServidos++;
            }else{
                i--;
            }
        }
        System.out.print("\nLas cantidades finales con las que quedo la cafetera fueron...");
        MostrarCantidades();
        System.out.println();
        RellenarCafetera();
    }
    public void MostrarCantidades(){
        System.out.println("\nMaquinaDeCafe.MaquinaDeCafe{" + "agua=" + agua + ", cafe=" + cafe + ", crema=" + crema + ", vasos=" + vasos + '}');
    }
    public void RellenarCafetera(){
        System.out.println("La cafetera ha sido rellenada con exito...");
    }
}
