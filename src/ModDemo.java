public class ModDemo {
    public static void main(String[] args) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10 / 3;
        drem = 10 % 3;


        System.out.println("iresult = " + iresult + "\nirem = " + irem + "\ndresult = " + dresult + "\ndrem = " + drem);


        int x = 0, y = 0;

        x = x + 1;
        x++;
        x += 1;


        int x1 = 10;
        System.out.println("y1 = " + x1++);
        int y1 = x1++;
        System.out.println("y1 = " + y1);


    }
}
