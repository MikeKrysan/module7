package Solution7_6_1;

public class Cat implements Soundable {
    String voice;

    public Cat(String sound) {
        this.voice = sound;
    }

    public void sound(String sound) {
        System.out.println("A can miau");
    }
}
