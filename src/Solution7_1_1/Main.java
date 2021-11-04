package Solution7_1_1;

/*
Переопределите метод toString() у класса Zoo так, чтобы зоопарк можно было вывести при помощи системного println(), то есть чтобы программа:

Zoo zoo = new Zoo();
zoo.change(2, new Dog);
System.out.println(zoo);

Вывела:

Zoo: [I am a Dog, I am a Cat, I am a Dog]

 */

public class Main {

    public static void main(String[] args) {
/*

You have to override toString() method
in the class Zoo

*/

        Zoo zoo = new Zoo();
        zoo.change(new Dog(), 2);
        System.out.println(zoo);


/*
This fragment has to output

Zoo: [I am a Dog, I am a Cat, I am a Dog]

*/
    }

}


//В классе Zoo смотри подсказки