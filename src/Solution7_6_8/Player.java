package Solution7_6_8;
/*
Напишите абстрактный класс Player. В нём создайте:

целочисленную переменную hp — здоровье;
целочисленную переменную level — уровень;
строковую переменную type — класс игрока;
строковую переменную weapon — оружие игрока;
конструктор принимающий параметры (hp, level, type, weapon);
абстрактный метод, возвращающий строку getFullInfo();
абстрактный метод без возвращаемого значения levelUp();
абстрактный метод, возвращающий булевое значение doDamage().

Создайте класс Wizard и пронаследуйте его от класса Player. Создайте в нём:

целочисленную переменную manaLevel — уровень маны;
строковую переменную element — стихия мага;
реализуйте конструктор, принимающий в себя параметры (hp, level, type, weapon, manaLevel, element);
реализуйте метод levelUp(), при вызове которой переменная level должна увеличиваться на 1;
реализуйте метод getFullInfo(), который будет возвращать строку, в которой все параметры стоят через пробел в порядке: hp, level, type, weapon, manaLevel, element;
реализуйте метод doDamage(), который при manaLevel >= 10 будет понижать manaLevel на 10 единиц и возвращать true, а при manaLevel < 10 будет возвращать false.

Создайте класс Warrior и пронаследуйте его от класса Player. Создайте в нём:

строковую переменную armor — броню воина;
реализуйте конструктор принимающий в себя параметры (hp, level, type, weapon, armor);
реализуйте метод levelUp(), при вызове которого переменная Level должна увеличиваться на 1;
реализуйте метод getFullInfo(), который будет возвращать строку, в которой все параметры стоят через пробел в порядке: hp, level, type, weapon, armor.
реализуйте метод doDamge(), который при вызове будет возвращать true.
 */
abstract public class Player {
    int hp;
    int level;
    String type;
    String weapon;

    public Player(int hp, int level, String type, String weapon) {
        this.hp = hp;
        this.level = level;
        this.type = type;
        this.weapon = weapon;
    }

    abstract String getFullInfo();
    abstract void levelUp();
    abstract boolean doDamage();
}
