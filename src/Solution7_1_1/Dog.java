package Solution7_1_1;

public class Dog extends Animal {
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I am a Cat";
    }
}
