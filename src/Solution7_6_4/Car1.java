package Solution7_6_4;

public class Car1 {
    String carModel;

    public Car1(String carModel) {this.carModel = carModel;}

    class Engine1 {
        boolean isWorking = false;
        int horsepower;

        public Engine1(int horsepower) {this.horsepower = horsepower;}

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
}
