/*
В заключение давайте устроим настоящую битву монстров! Мы добавили вам там ещё класс монстра Гигантский Змей, он очень похож на Зомби по коду.


Создайте класс Battle с методом:
void add (Monster monster)

Добавлять нужно до пяти монстров (далее следует отказ) методом void start(), который запускает метод void run(), который в свою очередь работает так: запускает метод attack() для каждого
 из монстров по порядку добавления по одному разу.

 Программа:
Battle battle = new Battle();
battle.add(new Zombie("Alice"));
battle.add(new Zombie("Bob"));
battle.add(new Zombie("Eve"));
battle.add(new GiantSnake("Kaa"));
battle.add(new GiantSnake("Son of Kaa"));

battle.add(new Zombie("Noname"));
battle.add(new GiantSnake("Noname"));

battle.start();

Должна вывести:
Monster Alice the Zombie was created
Monster Bob the Zombie was created
Monster Eve the Zombie was created
Monster Kaa the GiantSnake was created
Monster Son of Kaa the GiantSnake was created
Monster Noname the Zombie was created
No more monsters!
Monster Noname the GiantSnake was created
No more monsters!
Monster Alice the Zombie attacked with damage 5
Raaaauuughhhh Alice the Zombie growled
Monster Bob the Zombie attacked with damage 5
Raaaauuughhhh Bob the Zombie growled
Monster Eve the Zombie attacked with damage 5
Raaaauuughhhh Eve the Zombie growled
SSSSSS Kaa the GiantSnake growled
Monster Kaa the GiantSnake attacked with damage 7
Ssssss Kaa the GiantSnake growled
     ...and hid in the grass
SSSSSS Son of Kaa the GiantSnake growled
Monster Son of Kaa the GiantSnake attacked with damage 7
Ssssss Son of Kaa the GiantSnake growled
     ...and hid in the grass

Вывод огромен, но практически всё делают уже написанные классы. Собственно Battle выводит только No more monsters при попытке добавить в битву больше пяти монстров.

Обратите внимание: битва должна начинаться и с меньшим количеством монстров.

Программа:
Battle battle = new Battle();
battle.add(new Zombie("Alice"));
battle.add(new Zombie("Bob"));
battle.start();

Должна корректно работать и выводить:
Monster Alice the Zombie was created
Monster Bob the Zombie was created
Monster Alice the Zombie attacked with damage 5
Raaaauuughhhh Alice the Zombie growled
Monster Bob the Zombie attacked with damage 5
Raaaauuughhhh Bob the Zombie growled

 */



package Solution7_2_2;

public class Main {
    public static void main(String[] args) {
        /*
        Make class Monster abstract
        Fix class Zobie and ...
        */

        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Bob"));
        battle.add(new Zombie("Eve"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new GiantSnake("Son of Kaa"));

        battle.start();

        /*

            ...and The Battle starts!

        */
    }
}
