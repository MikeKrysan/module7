package Solution7_2_2;

public class Zombie extends Monster{

    //Fix this class

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    @Override
    public void growl(){
        System.out.println("Raaaauuughhhhh");
    }

    @Override
    public void attack(Monster monster){
        monster.damage(getForce());
        growl();
    }
}
