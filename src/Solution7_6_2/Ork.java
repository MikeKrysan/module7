package Solution7_6_2;
/*
Создайте интерфейс Playable. В нём должны быть следующие методы:

String move();
String attack();
String defence().
Создайте класс Orc, имплементирующий интерфейс Playable. В нём:

метод move() должен возвращать строку run;
метод attack() — строку ax blow;
метод defence() — строку block.
 */

public class Ork implements Playable{
    /*
    String run;
    String axBlow;
    String block;

    public Ork(String behavior) {
        this.run = behavior;
        this.axBlow = behavior;
        this.block = behavior;
    }
    */


    public String move() {
        return "run";
    }

    public String attack(){
        return "ax blow";
    }

    public String defence() {
        return "block";
    }

}
