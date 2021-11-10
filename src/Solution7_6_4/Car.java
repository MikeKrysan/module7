package Solution7_6_4;
/*
Создайте класс Car с вложенным в него классом Engine.

В классе Car должна быть:

строковая переменная carModel;
конструктор, принимающий carModel.
В классе Engine должны быть:

логические (boolean) поле isWorking (по умолчанию false);
целочисленное поле horsepower;
конструктор, принимающий horsepower;
метод String startStopEngine(), если isWorking равен true, то метод должен вернуть
 "engine was stopped" и поменять значение isWorking на false, иначе — "engine was started" и isWorking = true.
 */
public class Car extends Engine{
    private String carModel;

    public Car(String model) {
        //super();
        this.carModel = model;
    }
}

//*-Пример решения задания по курсу смотри в классе Car1