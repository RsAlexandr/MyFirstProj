package L7HW;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) { //   Найти самое длинное слово в предложении
        Scanner str = new Scanner(System.in);
        //String text = str.nextLine();
        String text = "Hello, world! I love you!";
        System.out.println(text);
        String array[] = text.split(" ,");

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i].length());

        }
    }
}
