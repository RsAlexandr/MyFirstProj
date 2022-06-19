package Homework;

import java.util.Scanner;

public class HomeWork_13_06_2022_3 {
    public static void main(String[] args) {
        //Создайте программу, определяющую является число чётным или нечётным.

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целочисленное число, а мы скажем является ли оно чётным или нет: ");
        int x = in.nextInt();
        if (x % 2 == 0) System.out.println("Число " + x + " является чётным числом");
        else System.out.println("Число " + x + " является нечётным числом");


    }
}
