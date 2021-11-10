package Solution7_6_6;

public class Vector2D extends Vector{

    public Vector2D(int x1, int y1, int x2, int y2) {   //z1, z2 = 0
        super(x1, y1, 0, x2, y2, 0);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1 - y2, 2));//search length
    }

    public String getVectorCords() {
        return (x2 - x1) + " " + (y2 - y1); //search cords
    }

    //метод getscalarProduct(Vector2D vector) (скалярное произведение), возвращающий скалярное произведение векторов (вещественное (double) число);

    public double getScalarProduct(Vector2D vector2D) { //take cords first and second vectors and search scalar product
        String cords = getVectorCords();
        String cords2 = vector2D.getVectorCords();

        return Integer.parseInt(cords.split(" ")[0]) * Integer.parseInt(cords2.split(" ")[0]) +
                Integer.parseInt(cords2.split(" ")[1]) * Integer.parseInt(cords.split(" ")[1]);
    }

    public double getAngle(Vector2D vector2D) {   //Search cos angle between vectors
        if(getLength() != 0 && vector2D.getLength() != 0) {
            return getScalarProduct(vector2D) / (this.getLength() * vector2D.getLength());
        }   else return -2.0;
    }
}
/*
1.Math.pow(a, b) - возведение в степень b числа а
2.Math.sqrt() - возвращает квадратный корень из агрумента.
3.длина вектора вычисляется по формуле : /x/=корень((а в квадрате) + (b в квадрате))
4.формула скалярного произведения векторов в пространстве: a*b = x1*x2+y1*y2+z1*z2 (метод scalarProduct)
5.Метод parseInt() — в Java используется для получения примитивного типа данных определенной строки, другими словами — преобразует строку в число.
  Метод parseXxx() — это статический метод и может иметь один аргумент или два.
6.Метод split() — в Java разделяет данную строку вокруг данного регулярного выражения и имеет два варианта.

Синтаксис
Синтаксис метода:

public String[] split(String regex, int limit)

или

public String[] split(String regex)
Параметры
Подробная информация о параметрах:

regex — разграничение регулярного выражения;
limit — порог, результатом которого означает, как много строк, должно быть возвращено.
Возвращаемое значение
В Java split() возвращает массив строк, вычисленных путем разделения данной строки вокруг данного регулярного выражения.
 */