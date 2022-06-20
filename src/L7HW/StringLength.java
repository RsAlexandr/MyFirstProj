package L7HW;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) { //   Найти самое длинное слово в предложении
        Scanner str = new Scanner(System.in);
        String text = str.nextLine();
        String longestworld;

        String array[] = text.split("[, .!?]");

        longestworld = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i].length() > longestworld.length()){
                longestworld = array[i];
            }
        }
      System.out.println("Самое длинное слово в предложении - это " + longestworld);
    }
}
