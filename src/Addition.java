import java.util.Scanner;

public class Addition {
    public static void main(String[] args){

        Scanner myLittleScaner = new Scanner(System.in); // Git is working
        int number1;
        int number2;
        int sum;

        System.out.println("Enter number1");
        number1 = myLittleScaner.nextInt();

        System.out.println("Enter number2");
        number2 = myLittleScaner.nextInt();



        sum = number1 + number2;
        System.out.println("Result is: " + sum);
        System.out.printf("Sum is: %d, %d",sum + sum+2, sum);



    }
}
