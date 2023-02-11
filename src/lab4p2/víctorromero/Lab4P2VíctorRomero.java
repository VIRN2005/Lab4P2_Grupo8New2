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

        String resp = "S";
        char respueta = resp.charAt(0);
        do {
            String moves = "";
            imprimir(numero);

            System.out.println("\n Ingrese los moves: ");
            moves = read.nextLine();

            String[] splitscositalarga = moves.split("|");
            String[] splitscositacorta = moves.split("-");

        } while (respueta == 'S');
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

    public static boolean Jaque(Pieza[][] tablero, int kingX, int kingY) {
        boolean move = true;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) {
                    move = false;
                    return move;
                } else {
                    int x = kingX + i;
                    int y = kingY + j;
                    if (x >= 0 && x < 8 && y >= 0 && y < 8) {

                        if (tablero[x][y] instanceof Peon || tablero[x][y] instanceof Caballo || tablero[x][y] instanceof Alfil || tablero[x][y] instanceof Torre || tablero[x][y] instanceof Dama || tablero[x][y] instanceof Rey) {
                            move = true;
                            return move;

                        }
                    }
                }
            }
        }
        return move;
    }

    public static boolean JaqueMate(int X, int Y, int[][] board) {
        // Verificar si el rey está en jaque
        if (!Jaque(board, X, Y)) {
            return false;
        }

        // Verificar si el rey tiene algún movimiento seguro
        if (X > 0) {
            if (board[X - 1][Y] == 0) {
                return false;
            }
        }
        if (X < 7) {
            if (board[X + 1][Y] == 0) {
                return false;
            }
        }
        if (Y > 0) {
            if (board[X][Y - 1] == 0) {
                return false;
            }
        }
        if (Y < 7) {
            if (board[X][Y + 1] == 0) {
                return false;
            }
        }
        if (X > 0 && Y > 0) {
            if (board[X - 1][Y - 1] == 0) {
                return false;
            }
        }
        if (X > 0 && Y < 7) {
            if (board[X - 1][Y + 1] == 0) {
                return false;
            }
        }
        if (X < 7 && Y > 0) {
            if (board[X + 1][Y - 1] == 0) {
                return false;
            }
        }
        if (X < 7 && Y < 7) {
            if (board[X + 1][Y + 1] == 0) {
                return false;
            }
        }
        return true;
    }

}
