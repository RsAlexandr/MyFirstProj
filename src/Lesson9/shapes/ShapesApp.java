package Lesson9.shapes;

public class ShapesApp {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "colored";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "contour";

        System.out.println("t1 info:");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is equal to " + t1.areaCalc());
        System.out.println();


        System.out.println("t2 info:");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is equal to " + t2.areaCalc());


    }
}
