package Homework;

import java.io.IOException;
import java.util.Scanner;

public class HomeWork_13_06_2022_5 {
    public static void main(String[] args) throws IOException { // Создайте программу, которая возвращает все пары множителей введённого числа (если таковые есть).

        Scanner input = new Scanner(System.in);
        System.out.println("Введите целочисленное число, чтобы увидеть все его пары множителей: ");
        int number = input.nextInt();
        for (int i = 2; i < number; i++){
            for (int j = 2; j < number; j++){
                if (i * j == number & i < j ){
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
            }
        }
    }
}
