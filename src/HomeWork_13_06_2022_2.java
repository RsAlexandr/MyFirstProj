import java.util.Scanner;

public class HomeWork_13_06_2022_2 {
    public static void main(String[] args) {

        //Создайте программу, которая выводит на экран приветствие на языке пользователя, который он указал заранее(3-4 варианта)
        try {
            System.out.println("Выберите язык:\n1.en\t2.ru\t3.ro\t4.fr");
            System.out.print("Введите номер одного из предложенных вариантов: ");
            int x;
            Scanner in = new Scanner(System.in);
            x = in.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Your choice english. Welcome!!!");
                    break;
                case 2:
                    System.out.println("Вы выбрали русский. Добро пожаловать!!!" + x);
                    break;
                case 3:
                    System.out.println("Ai ales limba romana. Bine ati venit!!!");
                    break;
                case 4:
                    System.out.println("Vous avez choisi le français. Accueillir!!!");
                    break;

                default:
                    System.out.println("Выберите один из предложенных вариантов. Варианта под номером " + x + " не существует.");

            }
        }
        catch (Exception e){
            System.out.println("Вы тут явно промахнулись! Для начала необходимо ввести числовое значение.");
        }

    }
}

