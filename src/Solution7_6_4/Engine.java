package Solution7_6_4;

public class Engine {
    boolean isWorking = false;
    int horsepower;

    public Engine(int power) {
        this.horsepower = power;
    }

    public Engine() {}      //IDEA затребовала пустой конструктор в данном (моем) решении.

    String startStopEngine() {
        if(this.isWorking) {
            isWorking = false;
            return "engine was stopped";
        } else {
            isWorking = true;
            return "engine was started";
        }

    }
}
