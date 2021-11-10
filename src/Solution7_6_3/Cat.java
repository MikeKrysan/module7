package Solution7_6_3;

public class Cat implements Eat, Edible, Moveable{

    public void eat() {
        System.out.println("I can eat someone");
    }

    public void beEaten() {
        System.out.println("I can be eaten by someone");
    }

    public void move() {
        System.out.println("I can move");
    }
}
