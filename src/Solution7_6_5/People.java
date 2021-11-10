package Solution7_6_5;

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
