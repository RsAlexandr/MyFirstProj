public class NestedIfElse {
    public static void main(String[] args) {



        int i = 1, j = 0, k = 2, a = 3, c = 4, b = 0, d = 7;

        if (i == 10){
            if (j < 20) a = b;
            if (k > 100) c = d;
            else a = c;
        }
        else a = d;
    }
}
