package Solution7_6_1;

public class Transport implements Soundable{
    String voice;

    public Transport(String sound) {
        this.voice = sound;
    }

    public void sound(String sound) {
        System.out.println("I can make noise!");
    }

}
