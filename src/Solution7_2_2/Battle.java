package Solution7_2_2;

public class Battle {

    final static private int MAX = 5;   //Создаем не больше 6 монстров для битвы
    private Monster[] monsters;         //Создаем массив в котором будет monsters0-monsters5
    private int n = 0;                  //создаем переменную для счетчика, чтобы считал монстров и змей

    Battle() {
        monsters = new Monster[MAX];
    }

    public void add (Monster monster) {
        if(n < MAX) {
            monsters[n++] = monster;
        } else {
            System.out.println("No more monsters!");
        }
    }

    public void run() {
        for( int i = 0; i < n; i++ ) {
            if(monsters[i]!=null) {
                monsters[i].attack(monsters[i]);
            }
        }
    }


    public void start() {
        run();
    }
}
