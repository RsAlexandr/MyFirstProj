package L7HW;
import java.util.Random;

public class MinElement {
    public static void main(String[] args) { //   Найти минимальный элемент целочисленного массива заполненного случайными числами в заданном диапазоне
        Random rand = new Random();
        int array[] = new int[50];
        int min;
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(1000);
            System.out.print(i + ".[" + array[i] + "] "); // печатаем элемент и его индекс
        }

        min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++){
             if (array[i] < min) {
                 min = array[i];
                 index = i;
             }
        }
        System.out.println("\nМинимальное число массива = " + min);
        System.out.println("Индекс числа = " + index);
    }
}
