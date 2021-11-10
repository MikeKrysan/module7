package Solution7_6_5;
/*
Создайте абстрактный класс People. В нём должны быть:

строковое поле name;
целочисленное поле age;
строковое поле profession;
конструктор, принимающий переменную String name, int age, String profession;
абстрактный метод getProfession(), возвращающий строку — профессию человека;
абстрактный метод getAge(), возвращающий целое число — возраст человека;
абстрактный метод getName(), возвращающий строку — имя человека.
Создайте класс Teacher, который является наследником класса People. В нём должны быть:

строковое поле subject (преподаваемый предмет);
конструктор принимающий имя, возраст, профессию и преподаваемый предмет;
метод getProfession должен возвращать  строку — профессию;
метод getAge() должен возвращать целое число — возраст;
метод getName() должен возвращать строку — имя;
метод getSubject() должен возвращать строку — преподаваемый предмет;
метод giveALesson() должен вернуть строку "The lesson was ended".
 */

abstract public class People {
    String name;
    int age;
    String profession;

    public People(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public abstract String getName();
    public abstract String getProfession();
    public abstract int getAge();


}
