package lab4p2.víctorromero;

import java.util.Random;
import java.util.Scanner;

public class Lab4P2VíctorRomero {

    static Scanner read = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        System.out.println("Gerardo Cano - 12151024");
        System.out.println("Victor Romero - 12211079\n");

        int[][] numeros = new int[8][8];
        Pieza[][] numero = llenarMatriz(8, 8);

        imprimir(numero);
        while (true) {
            int x = read.nextInt();
            int y = read.nextInt();
            int nX = read.nextInt();
            int nY = read.nextInt();
            
           
        }
    }

    public static Pieza[][] llenarMatriz(int fila, int columna) {
        Pieza[][] temporal = new Pieza[fila][columna];

        temporal[0][0] = new Torre("t", 0, 0, false);
        temporal[0][7] = new Torre("t", 0, 7, false);
        temporal[7][0] = new Torre("T", 7, 0, true);
        temporal[7][7] = new Torre("T", 7, 7, true);

        temporal[0][1] = new Caballo("c", 0, 1, false);
        temporal[0][6] = new Caballo("c", 0, 6, false);
        temporal[7][1] = new Caballo("C", 7, 1, true);
        temporal[7][6] = new Caballo("C", 7, 6, true);

        temporal[0][2] = new Alfil("a", 0, 2, false);
        temporal[0][5] = new Alfil("a", 0, 5, false);
        temporal[7][2] = new Alfil("A", 7, 2, true);
        temporal[7][5] = new Alfil("A", 7, 5, true);

        temporal[0][3] = new Dama("d", 0, 3, false);
        temporal[0][4] = new Rey("r", 0, 4, false);

        temporal[7][3] = new Dama("D", 7, 3, true);
        temporal[7][4] = new Rey("R", 7, 4, true);

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (temporal[i][j] == null) {
                    if (i == 1) {
                        temporal[i][j] = new Peon("p", i, j, false);
                    }
                    if (i == 6) {
                        temporal[i][j] = new Peon("P", i, j, true);
                    }
                } else {
                    if (temporal[i][j] instanceof Dama) {

                    }
                }

            }
        }

        return temporal;
    }

    public static void imprimir(Object[][] numero) {
        String cadena = "";
        System.out.println("  A   B   C   D   E   F   G   H ");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < numero[i].length; j++) {
                if (numero[i][j] != null) {
                    System.out.print("[" + ((Pieza) numero[i][j]).getNombre() + "]" + " ");
                } else {
                    System.out.print("[" + " " + "]" + " ");
                }
            }
            System.out.println(" ");

        }
    }
}
