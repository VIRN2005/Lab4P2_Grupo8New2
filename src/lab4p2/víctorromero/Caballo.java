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

    @Override
    public boolean movimiento(Pieza[][] tablero, int x, int y, int nX, int nY, boolean white) {

    }

}
