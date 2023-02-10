package lab4p2.víctorromero;

public class Peon extends Pieza {

    public Peon() {
        super();
    }

    public Peon(String Nombre, int x, int y, boolean verif) {
        super(Nombre, x, y, verif);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isVerif() {
        return verif;
    }

    public void setVerif(boolean verif) {
        this.verif = verif;
    }

    @Override
    public String toString() {
        return "Peon{" + '}';
    }

    @Override
    public Pieza[][] movimiento(Pieza[][] tablero, int x, int y, int nX, int nY) {
        if (tablero[x][y].isVerif()) {
            if (x == nX && (y == nY - 1 || y == nY - 2)) {
                if (x == 6 && y == nY - 2) {
                    tablero[x][nY] = tablero[x][y];
                    tablero[x][y] = null;
                    tablero[x][nY].setY(nY);
                    return tablero;
                } else if (y == nY - 1) {
                    tablero[x][nY] = tablero[x][y];
                    tablero[x][y] = null;
                    tablero[x][nY].setY(nY);
                    return tablero;
                } else {
                    System.out.println("Movimiento Invalido");
                    return tablero;
                }
            } else if ((x == nX - 1 || x == nX + 1) && (y == nY - 1)) {
                if (tablero[nX][nY] instanceof Pieza) {
                    if (!tablero[nX][nY].isVerif()) {
                        tablero[x][nY] = tablero[x][y];
                        tablero[x][y] = null;
                        tablero[x][nY].setY(nY);
                        return tablero;
                    } else {
                        System.out.println("Movimiento Invalido");
                        return tablero;
                    }
                }
            } else {
                System.out.println("Movimiento Invalido");
                return tablero;
            }
        }
    
    }

}
