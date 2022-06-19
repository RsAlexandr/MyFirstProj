package L7HW;

public class DecreaseArrayElement {
    public static void main(String[] args) {   //	Уменьшить все элементы массива на 25%
        float array[] = {-1, -10, 0, 0.5F, 24, 56, 78, 9, 23, 45, 85, 90, 10, 100, 500, 1000, 200, 120};
        for (int i = 0; i < array.length; i++){
            array[i] = array[i]/4*3;
            System.out.print("["+ array[i] + "]  ");
        }
    }
}
