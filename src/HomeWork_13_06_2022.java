import java.util.Scanner;

public class HomeWork_13_06_2022 {
    public static void main(String[] args) {

        //Напишите калькулятор, который получает числа введенные пользователем, и производит с ними заданные действия – поиск суммы / среднего значения/ сравнение.
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Вам необходимо ввести два числа от 1 до 1000, а дальше мы всё сделаем сами!");
            System.out.print("Введидте первое число: ");
            float first = in.nextFloat();
            System.out.print("Введидте второе число: ");
            float second = in.nextFloat();
            if (first < 1 | second > 1000)
                System.out.println("Одно из введённых чисел выходит за рамки обозначенного диапазона. Прочтите условие перед началом ввода.");
            else {
                System.out.println("Сумма чисел: " + (first + second));
                System.out.println("Среднее значение: " + ((first + second) / 2));
                //System.out.println("Среднее значение: " + ((first + second) / 2));
                if (first > second) System.out.println(first + " больше чем " + second + " на " + (first - second));
                if (first < second) System.out.println(first + " меньше чем " + second + " на " + (second - first));
                if (first == second) System.out.println(first + " и " + second + " равны ");

            }

        }
        catch (Exception e){
            System.out.println("Вы ввели не числовое значение. Прочтите условие перед началом ввода.");
        }


    }
}
