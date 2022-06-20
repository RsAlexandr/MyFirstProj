package L7HW;

public class ArrayInReverse {
    public static void main(String[] args) { //  Переписать массив в обратном направлении
        int array[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        int array2[] = new int[array.length]; //  Создаём массив равный длине первого массива

        System.out.print("Исходный массив: ");
        for (int i = 0; i < array.length; i++){
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println();

        System.out.print("Массив в реверсе: ");
        for (int i = 0; i < array.length; i++){
            array2[i] = array[array.length - (i+1)]; //  по одному элементу за цикл заполняем array2 элементами первого массива в обратном порядке
            System.out.print("[" + array2[i] + "] ");
        }
    }
}
