package Solution7_3_2;

abstract public class Entity {
    //TODO
    private String name;
    private int hp = 100;
    private boolean destroyed = false;

    public Entity (String name) {
        this.name = name;
    }

    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println("Entity " + name + " was destroyed");
            return true;
        }
        return false;
    }

    public boolean isDestroyed(){
        return destroyed;
    }
    //
}
