package Solution7_3_2;

public class Human extends Entity implements Fighter {

    public Human(String name) {
        super(name + " the Man ");  //ключевое слово super используется для вызова конструктора суперкласса
    }


    public void attack(Entity m){
        m.damage(1);
    }

}

