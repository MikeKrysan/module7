package Solution7_1_1;

import java.util.Arrays;

public class Zoo {
    // Override toString here...
    public String toString(){
        //2                 //1.
        return "Zoo: " + Arrays.toString(objects);
    }
    //
    Object[] objects;

    public Zoo() {
        objects = new Object[3];

        objects[0] = new Dog();
        objects[1] = new Cat();
        objects[2] = new Reptile();
    }

    public void print() {
        for (Object a : objects) {
            System.out.println(a);
        }
    }

    public void change(Object a, int i) {
        if (i >= 0 && i < objects.length)
            objects[i] = a;
    }
}

/*
1.Можно обойтись без цикла, если воспользоваться методом toString() из класса Arrays
2. Возвращайте сумму строк "Zoo: " и результата toString() из первой подсказки.
 */