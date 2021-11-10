package Solution7_6_9;

public class Rectangle extends Quadrangle implements Figure{
    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    double getLargeDiagonal() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    double getHeight() {
        return Math.min(a, b);
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    public double area() {
        return a * b ;
    }

    @Override
    public double perimeter() {
        return 2*a + 2*b;
    }
}
