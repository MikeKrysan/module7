package Solution7_2_2;

public abstract class Monster {
    // Fix this class
    private String name;
    private int force;
    private int hp = 15;
    private boolean destroyed = false;

    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created ");
    }

    protected int getForce() {
        return force;
    }



    abstract public void attack(Monster monster);

    protected boolean damage(int dhp) {
        hp -= dhp;
        if (hp <= 0) {
            destroyed = true;
            System.out.println("Monster" + name + "was destroyed");
            return true;
        }
        return false;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    abstract public void growl();


}
