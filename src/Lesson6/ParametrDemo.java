package Lesson6;

public class ParametrDemo {
    public static void main(String[] args) {
        CheckNumber e = new CheckNumber();

        if (e.isEven(10)) System.out.println("10 - is even");
        if (e.isEven(9)) System.out.println("9 - is even");
        if (e.isEven(8)) System.out.println("8 - is even");

        if (e.isDivider(2, 20)) System.out.println("2 is devider of 20");
        if (e.isDivider(3, 20)) System.out.println("3 is devider of 20");
    }
}
