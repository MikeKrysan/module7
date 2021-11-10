package Solution7_6_3;

public class Dog implements Eat, Moveable{

    public void eat() {
        System.out.println("I am a dog, and I can eaten");
    }

    public void move() {
        System.out.println("I am a dog, and I can move");
    }
}
