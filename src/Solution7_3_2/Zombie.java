package Solution7_3_2;

public class Zombie extends Monster implements Fighter{
    public Zombie(String name) {
        super(name + " the Zombie", 20);
    }

    public void growl(){
        System.out.println("Raaaauuughhhh");
    }

    @Override
    public void attack(Entity entity){
        entity.damage(getForce());
        growl();
    }
}
