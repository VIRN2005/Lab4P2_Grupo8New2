package lab4p2.víctorromero;

public abstract class Rey extends Pieza {

    public Rey() {
        super();
    }

    public Rey(String Nombre, int x, int y, boolean verif) {
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
        return "Rey{" + '}';
    }

    public boolean movimiento(Pieza[][] tablero, int x, int y, int nX, int nY, boolean white) {
        boolean move = true;

        if (((Pieza) tablero[nX][nY]).isVerif() == white) {
            if (nY <= 1 && nX <= 1) {
            } else {
                move = false;
            }
        } else {
            move = false;
        }
        return move;
    }
}
