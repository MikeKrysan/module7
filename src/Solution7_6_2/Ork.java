package Solution7_6_2;

public class Ork implements Playable{
    /*
    String run;
    String axBlow;
    String block;

    public Ork(String behavior) {
        this.run = behavior;
        this.axBlow = behavior;
        this.block = behavior;
    }
    */


    public String move() {
        return "run";
    }

    public String attack(){
        return "ax blow";
    }

    public String defence() {
        return "block";
    }

}
