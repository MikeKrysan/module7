package Solution7_5_2;

/*
Мы все ещё не добавили в нашу игру класс Player, давайте сделаем это. Пронаследуйте класс Player от Human и добавьте ему рюкзак, объект класса Backpack, в который можно положить предметы — строки. При этом сделайте этот класс внутренним, чтобы можно было работать так:

Программа:

Player player = new Player("Tourist");
Player.Backpack pb = player.backpack;
System.out.println(pb);
player.take("rope");
System.out.println(pb);
player.take("bottle");
player.take("flower");
System.out.println(pb);

Должна вывести:

the backpack is empty
rope in the backpack
rope,bottle,flower in the backpack
 */

public class Main {
    public static void main(String[] args) {
/*

Extend Human class by Player class with inner Backpack

*/

        Player player = new Player("Tourist");
        Player.Backpack pb = player.backpack;
        System.out.println(pb);
        player.take("rope");
        System.out.println(pb);
        player.take("bottle");
        player.take("flower");
        System.out.println(pb);

/*

The code above has to output

the backpack is empty
rope in the backpack
rope,bottle,flower in the backpack

*/
    }
}
