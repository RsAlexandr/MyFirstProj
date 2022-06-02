public class Operators {
    public static void main(String[] args) {

        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;

        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("i == j");
        if(i > j) System.out.println("i > j");
        if(i >= j) System.out.println("i >= j");

        b1 = true;
        b2 = false;

        if(b1 & b2)  System.out.println("b1 & b2");
        if(!(b1 & b2))  System.out.println("!(b1 & b2)");
        if(b1 | b2)  System.out.println("b1 | b2");
        if(b1 ^ b2)  System.out.println("b1 ^ b2");
        if(b1 && b2)  System.out.println("b1 && b2");

        int n, d, q;

        n = 10;
        d = 2;

        if(d != 0 && (n % d) == 0)
            System.out.println(d + " вляется делителем " + n);

        d = 0;
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " вляется делителем " + n);

        int thisNumber = 0;


        if(true | false) System.out.println("true | false");
        if(true | (++thisNumber > 0)) System.out.println("true | false");
        if(true || false) System.out.println("true || false");
        if(true & false) System.out.println("true & false");
        if(true && false) System.out.println("true && false");
        if(true ^ false) System.out.println("true ^ false");
        if(!false) System.out.println("!false");
        if(!true) System.out.println("!true");

        if(false | true) System.out.println("false | true");




    }
}
