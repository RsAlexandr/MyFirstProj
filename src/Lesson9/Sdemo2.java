package Lesson9;

public class Sdemo2 {
    public static void main(String[] args) {
        System.out.println("value of val: " + StaticMethod.val);
        System.out.println("value returned by valDiv2: " + StaticMethod.valDiv2());

        StaticMethod.val = 4;

        System.out.println("value of val: " + StaticMethod.val);
        System.out.println("value returned by valDiv2: " + StaticMethod.valDiv2());
    }
}
