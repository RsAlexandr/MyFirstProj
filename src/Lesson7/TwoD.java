package Lesson7;

public class TwoD {
    public static void main(String[] args) {
        int i, t;
        int f[] = {1,2,3,4,5,6,9,8,7};

        int table[][] = new int[3][4];
        for (t = 0; t <3; ++t){
            for (i = 0; i < 4; ++i){
                table[t][i] = (t*4) + i + 1;
                System.out.print(table[t][i] + "\t");
            }
            table[0][0] = 89;

        }

        System.out.println(f.toString().toLowerCase());
    }
}
