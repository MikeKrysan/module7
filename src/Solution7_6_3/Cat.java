package Solution7_6_3;
/*
Создайте интерфейсы:

Movable (может двигаться), в нём создайте метод void move();
Edible (может быть съеден), в нём создайте метод void beEaten();
Eat (может съесть), в нём создайте метод void eat().
Создайте классы Dog, Cat, Mouse.

Кот (Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
Мышь (Mouse) может передвигаться, и её могут съесть.
Собака (Dog) может передвигаться и съесть кого-то.
 */

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
