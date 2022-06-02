import java.util.Scanner;

public class Comparison {
    public static void main(String[] args){

        Scanner myLittleScaner = new Scanner(System.in);
        int number1;
        int number2;
        int sum;

        System.out.println("Enter number1");
        number1 = myLittleScaner.nextInt();

        System.out.println("Enter number2");
        number2 = myLittleScaner.nextInt();

        if(number1 == number2){
            System.out.printf("%d == %d%n", number1, number2);
        }
        if(number1 != number2){
            System.out.printf("%d != %d%n", number1, number2);
        }
        if(number1 < number2){
            System.out.printf("%d < %d%n", number1, number2);
        }
        if(number1 > number2){
            System.out.printf("%d > %d%n", number1, number2);
        }
        if(number1 <= number2){
            System.out.printf("%d <= %d%n", number1, number2);
        }
        if(number1 >= number2){
            System.out.println( number1 == number2);
        }

    }
}
