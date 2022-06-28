package Lesson9.shapes;

public class Triangle extends TwoDShape{

    String style;

    double areaCalc() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Triangle has style: " + style);
    }
}
