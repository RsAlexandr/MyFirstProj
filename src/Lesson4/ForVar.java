package Lesson4;

public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        for (int i = 1; i <= 5; i++){
            sum += i;
            fact *= i;
            System.out.println("summa = " + sum);

        }
        System.out.println("summa = " + sum);
        System.out.println("factorial = " + fact);
    }
}
