import java.util.Arrays;
import java.util.Comparator;

//Сортировка строки нестандартно - по длине.
public class ComparatorExample implements Comparator<String> {
    @Override
    public int compare(String arg0, String arg1) {
        // считаем, что null-ссылки "больше всех"
        // при сортировке они должны уйти в конец
        if (arg0 == null)
            return 1;
        if (arg1 == null)
            return -1;
        // точно две не-null строки -- сравниваем по длине
        return arg0.length() - arg1.length();
    }
}


class Main {

    public static void main(String[] args) {
        String[] array = {"Apple","Pineapple", "DragonFruit", "Orange", "Lime", "Cherry"};
        Arrays.sort(array, new ComparatorExample());
        System.out.println(Arrays.toString(array));
    }
}

/*
Сам алгоритм сортировки работает так: он постоянно сравнивает какие-то пары строк, и на основании результата сравнения делает вывод о том, какие строки переставить.
 Эту функцию сравнения (ну, с ё-поправкой) выполняет сам класс String. Но можно её поменять.

В классе Arrays есть перегруженный вариант метода sort(), который вторым параметром принимает «сравниватель»: объект, реализующий сравнение двух объектов, реализующий интерфейс Comparator.

Этот интерфейс состоит из единственного метода compare(), который принимает два объекта и возвращает вердикт — целое число. Если с точки зрения компаратора объекты равны,
 метод должен возвратить 0. Если первый переданный объект компаратором считается «большим», возвращается положительное число. И, наконец, если второй объект считается “«большим»,
  должно возвращаться отрицательное число. Часто это 1 и -1, но это необязательно.
 */