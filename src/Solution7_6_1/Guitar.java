package Solution7_6_1;

public class Guitar implements Soundable{
    String voice = "";
    public void sound(String sound) {
        this.voice = sound;
        System.out.println("I can play");
    }
}
