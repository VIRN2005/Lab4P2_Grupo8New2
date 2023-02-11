package lab4p2.víctorromero;

public class Caballo extends Pieza {

    public Caballo() {
        super();
    }

    public Caballo(String Nombre, int x, int y, boolean verif) {
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
        return "Caballo{" + '}';
    }

    public boolean movimiento(Pieza[][] tablero, int x, int y, int nX, int nY, boolean white) {
        boolean move = true;

        int newX = Math.abs(nX - x);
        int newY = Math.abs(nY - y);

        if ((newX == 2 && newY == 1) || (newX == 1 && newY == 2)) {
            move = true;
        } else {
            move = false;
        }

        return move;
    }

    @Override
    public boolean movimiento(Pieza[][] tablero, int x, int y, int nX, int nY) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
