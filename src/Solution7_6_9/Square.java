package Solution7_6_9;

public class Square extends Quadrangle implements Figure{
    public Square(int a, String color){
        super(a, a, color); //a = b
    }

    @Override
    double getLargeDiagonal() {
        return a * Math.sqrt(2);
    }

    @Override
    double getHeight() {
        return a;
    }

    @Override
    String getColor() {
        return color;
    }

    public double area() {
        return a * b;
    }

    public double perimeter() {
        return 2*a + 2*b;
    }
}
