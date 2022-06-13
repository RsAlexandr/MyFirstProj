package Lesson4;

import java.io.IOException;

public class DoWhileDemo {
    public static void main(String[] args) throws IOException {
        char ch;

        do {
            System.out.println("Нажмите нужную клавишу, а затем ENTER: ");
            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}
