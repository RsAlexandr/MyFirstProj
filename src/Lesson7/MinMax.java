package Lesson7;

public class MinMax {
    public static void main(String[] args) {
        int num[] = new int[10];

        int min, max;

        num[0] = 99;
        num[1] = 52;
        num[2] = 40;
        num[3] = -35;
        num[4] = 5;
        num[5] = 89;
        num[6] = 5;
        num[7] = 22;
        num[8] = 65;
        num[9] = 3;

        int num2[] = {1, 5, -10, 95, -2, 88, 23, 17, 27};

        min = max = num2[0];
        for (int i = 1; i < 9; i++){
            if (num2[i] < min) min = num2[i];
            if (num2[i] > max) max = num2[i];
        }
        System.out.println("min = " + min + ", max = " + max);
    }
}
