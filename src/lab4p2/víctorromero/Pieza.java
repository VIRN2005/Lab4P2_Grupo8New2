package lab4p2.víctorromero;

public abstract class Pieza {

    protected String Nombre;
    protected int x;
    protected int y;
    protected boolean verif;

    public Pieza() {
    }

    public Pieza(String Nombre, int x, int y, boolean verif) {
        this.Nombre = Nombre;
        this.x = x;
        this.y = y;
        this.verif = verif;
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
        return "Pieza{" + "Nombre=" + Nombre + ", x=" + x + ", y=" + y + ", verif=" + verif + '}';
    }

    public abstract boolean movimiento(Pieza[][] tablero, int x, int y, int nX, int nY);
}
