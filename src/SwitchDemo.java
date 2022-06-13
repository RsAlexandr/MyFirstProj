public class SwitchDemo {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 100; x++){
            switch (x){
                case 0:
                    System.out.println("x is 0 : " + x);
                    break;
                case 1:
                    System.out.println("x is 1 : " + x);
                    break;
                case 2:
                    System.out.println("x is 2 : " + x);
                    break;
                case 3:
                    System.out.println("x is 3 : " + x);
                    break;
                case 4:
                    System.out.println("x is 4 : " + x);
                    break;
                case 5:
                    System.out.println("x is 5 : " + x);
                    break;
                case 6:
                    System.out.println("x is 6 : " + x);
                    break;
                default:
                    System.out.println("x more than 6 : " + x);
            }
        }
    }
}
