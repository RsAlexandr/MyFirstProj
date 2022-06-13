package Lesson4;

public class Break2 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++){
            System.out.println("Outer loop counter: " + i);
            System.out.println("Inner loop counter: ");
            int t = 0;
            while (t < 100){
                if (t == 10) break;
                System.out.println(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("loops are completed");
    }
}
