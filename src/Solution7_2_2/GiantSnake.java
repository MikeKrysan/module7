package Solution7_2_2;


public class GiantSnake extends Monster{

    public GiantSnake(String name) {
        super(name + " the GiantSnake", 7);
    }

    @Override
    public void growl(){
        System.out.println("Ssssss");
    }



    @Override
    public void attack(Monster monster){
        monster.damage(getForce());
        growl();
    }
}
