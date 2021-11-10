package Solution7_6_3;

public class Mouse implements Moveable, Edible{

    public void move() {
        System.out.println("I am a mouse, and I can move");
    }

    public void beEaten() {
        System.out.println("I'm a mouse, and I can be eaten someone");
    }
}
