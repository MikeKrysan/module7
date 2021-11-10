package Solution7_6_1;
/*
Имеется три класса: class Cat, class Transport и class Guitar.

Придумайте интерфейс, который бы объединял поведение этих трех классов, и унаследуйте каждый класс от этого интерфейса. Реализуйте хотя бы один метод у интерфейса.
 */

public interface Soundable {
    public void sound(String sound);
}
