import java.util.Scanner;

public class HomeWork_13_06_2022_4 {
    public static void main(String[] args) {    /* Создайте программу, которая принимает 5 численных значений (либо буквенных символов одного регистра)
                                                   и возвращает их в порядке возрастания (или в алфавитном порядке, если пользователь ввёл буквы) */
        Scanner str = new Scanner(System.in);
        String x = str.next();


        for (int i = 0; i < x.length(); i++) System.out.println(x.toUpperCase());


    }
}
