public class Tarea_3 {
    public static void main(String[] args) {

        String cadena[][] = new String[5][5];
        int fila = 0;

        //Primera columna

        cadena[0][0] = "*";
        cadena[1][0] = "|";
        cadena[2][0] = "|";
        cadena[3][0] = "|";
        cadena[4][0] = "*";

        //Segunda columna

        cadena[0][1] = "-";
        cadena[1][1] = " ";
        cadena[2][1] = " ";
        cadena[3][1] = " ";
        cadena[4][1] = "-";

        //Tercera columa

        cadena[0][2] = "-";
        cadena[1][2] = " ";
        cadena[2][2] = " ";
        cadena[3][2] = " ";
        cadena[4][2] = "-";

        //Cuarta columna

        cadena[0][3] = "-";
        cadena[1][3] = " ";
        cadena[2][3] = " ";
        cadena[3][3] = " ";
        cadena[4][3] = "-";

        //Quinta columna

        cadena[0][4] = "*";
        cadena[1][4] = "|";
        cadena[2][4] = "|";
        cadena[3][4] = "|";
        cadena[4][4] = "*";

        for (int i = 0; i <=4; i++){

            for (int j = 0; j <=4; j++){
                System.out.print(cadena[fila][j]);
            }
            fila++;
            System.out.print("\n");
        }
    }
}
