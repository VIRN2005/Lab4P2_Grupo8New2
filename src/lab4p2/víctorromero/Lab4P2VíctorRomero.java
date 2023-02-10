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
        Object[][] numero = llenarMatriz(8, 8);

        imprimir(numero);
    }

    public static Pieza[][] llenarMatriz(int fila, int columna) {
        Pieza[][] temporal = new Pieza[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (temporal[i][j] == null) {
                } else {
                    if (temporal[i][j] instanceof Dama) {

                    }
                    

                    System.out.println("[" + ((Pieza) temporal[i][j]).getNombre() + "]");
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
                System.out.print("[" + " " + "]" + " ");
            }
            System.out.println(" ");

        }
    }
}
