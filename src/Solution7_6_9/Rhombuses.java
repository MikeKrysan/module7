package Solution7_6_9;

public class Rhombuses extends Quadrangle implements Figure{
    double alpha;
    double beta;

    public Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    double getLargeDiagonal() {
        double d1 = Math.sqrt(a * a + a * a - 2 * a *a * Math.cos(Math.toRadians(alpha)));
        double d2 = Math.sqrt(a * a + a * a - 2 * a *a * Math.cos(Math.toRadians(beta)));
        return Math.max(d1, d2) ;
    }

    @Override
    double getHeight() {
        return a * Math.sin(Math.toRadians(alpha));
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    public double area() {
        return b * getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * a + 2 * b;
    }
}
