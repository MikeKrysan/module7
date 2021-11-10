package Solution7_6_7;

public class Car extends Transport{
    int maxPassengers;

    public Car(int fuel, int speed, int maxPassengers) {
        super(fuel, speed);
        this.maxPassengers = maxPassengers;
    }

    public int getFuelLevel() { //getter
        return fuel;
    }

    public boolean canMove(int n) {
        if(fuel >= n) {         //if fuel >=n than car can move
            fuel -=n;
            return true;
        }   else return false;
    }

    public int getMaxPassengers() { //getter
        return maxPassengers;
    }
}
