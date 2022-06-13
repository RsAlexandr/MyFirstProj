import javax.swing.*;
import java.io.IOException;

public class KbIn {
    public static void main(String[] args) throws IOException {
        char ch;

        System.out.println("Нажмите нужную клавишу, а затем клавишу [ENTER]: ");

        ch = (char) System.in.read();
        System.out.println("Вы нажали клавишу " + ch);
    }
}
