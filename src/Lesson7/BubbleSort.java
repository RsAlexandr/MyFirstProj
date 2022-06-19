package Lesson7;

public class BubbleSort {
    public static void main(String[] args) {
        int needsToBubbleSorted[] = {2,5,65,-5,54,0,0,-95,-15,97,31};
        int a, b, tmp;
        int size = 10;

        System.out.println("Initial array: ");
        for (int i = 0; i < 10; i++){
            System.out.print(needsToBubbleSorted[i] + ", ");
        }


        for (a = 1; a < size; a++)
            for (b = size-1; b >= a; b--){
                if (needsToBubbleSorted[b-1] > needsToBubbleSorted[b]){
                    tmp = needsToBubbleSorted[b-1];
                    needsToBubbleSorted[b-1] = needsToBubbleSorted[b];
                    needsToBubbleSorted[b] = tmp;
            }
        }


        System.out.println("\nSorted array: ");
        for (int i = 0; i < 10; i++){
            System.out.print(needsToBubbleSorted[i] + ", ");
        }
    }
}
