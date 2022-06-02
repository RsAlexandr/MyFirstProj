public class LiteralsDemo {
    public static void main(String[] args) {

        boolean isActive = false;
        boolean isAlive = true;

        byte a = 3;
        byte b = -127;

         short c = -32768;
         short d = 32767;

         int e = -2147483648;
         int f = 2147483647;

         long g = -9_223_327_036_854_775_808L;
         long h = 9223327036854775808L;

         String hello = "Hello name: \\ user \\";
         System.out.println(hello.indent(150));



    }
}
