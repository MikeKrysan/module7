package Solution7_6_7;
/*
Напишите абстрактный класс Transport. У него должны быть:

целочисленное поле fuel;
целочисленное поле speed;
конструктор, принимающий fuel и speed;
абстрактный метод canMove(int n), возвращающий логическое (boolean) значение — сможет ли транспорт поехать n километров;
абстрактный метод getFuelLevel(), возвращающий целое число — уровень топлива.

Напишите class Car, являющийся наследником от класса Transport и имеющий:

целочисленное поле maxPassengers — максимальное количество пассажиров;
конструктор, принимающий в себя fuel, speed, maxPassengers;
метод getFuelLevel(), возвращающий целое число — fuel;
метод canMove(int n), должен вернуть true, если fuel >= n и уменьшать уровень fuel на n, иначе возвращать false;
метод getMaxPassenger(), возвращающий целое число — максимальное число пассажиров.

Напишите класс Plane, являющийся наследником от класса Transport и имеющий:

конструктор, принимающий в себя fuel, speed;
метод getFuelLevel(), возвращающий fuel;
метод canMove(int n) должен вернуть true, если fuel >= n, и уменьшать уровень fuel на n, иначе возвращать false;
метод fillFuel(int n), ничего не возвращающий, но повышающий уровень fuel на n.
 */
abstract public class Transport {
    int fuel;
    int speed;

    public Transport(int fuel, int speed) {
        this.fuel = fuel;
        this.speed = speed;
    }

    abstract boolean canMove(int n);

    abstract int getFuelLevel();
}
