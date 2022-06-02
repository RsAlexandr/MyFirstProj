import java.sql.SQLOutput;

public class VarInitDemo {
    public static void main(String[] args) {
        int x;
        int y =-1;

        for(x = 0; x < 3; x++){


            System.out.println("y " + y);
            y += 100;

            System.out.println("Изменённое значение y: " + y);

        }
    }
}
