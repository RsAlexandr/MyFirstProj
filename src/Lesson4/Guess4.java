package Lesson4;

import java.io.IOException;

public class Guess4 {
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 'S';

        do {
            System.out.println("Задумана буква от A до Z ");
            System.out.println("Угадайте! ");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("Правильно!!! ");
            else {
                System.out.print(" нужная буква находится ближе к ");
                if (ch < answer) System.out.println("концу алфавита");
                else System.out.println("началу алфавита");
                System.out.println("Попробуйте ещё раз.");
            }

        } while (answer != ch);
    }

}
