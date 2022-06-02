public class CastDemo {
    public static void main(String[] args) {

        int i;
        float f;
        i = 10;
        f = i;
        System.out.println(f);




        long l;
        double d;
        l = 100123285L;
        d = l;
        System.out.println("L & D: " + l + " " + d);



        double x, y;
        byte b;
        int ii;
        char ch;

        x = 10.0;
        y = 3.0;
        ii = (int) (x/y);
        System.out.println(ii);

        ii = 259;
        b = (byte) ii;
        System.out.println("b = " + b);


    }
}
