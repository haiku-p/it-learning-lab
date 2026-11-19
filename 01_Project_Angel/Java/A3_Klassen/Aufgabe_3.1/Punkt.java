public class Punkt {
    // Attribute
    private double x;
    private double y;

    // Constructor 1: Ohne Parameter
    public Punkt() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor 2; mit zwei Parameter
    public Punkt (double a, double b){
        this.x = a;
        this.y = b;
    }

    // Constructor 3: Kopierkonstruktor
    public Punkt(Punkt p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setter
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double abstand() {
        return Math.sqrt(x * x + y * y);
    }
}