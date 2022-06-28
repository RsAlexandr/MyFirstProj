package Lesson8;

public class AccessDemo {
    public static void main(String[] args) {

        MyClass ob = new MyClass();

        ob.setAlpha(10);

        ob.beta = 11;
        ob.gamma = 99;

        System.out.println(ob);

    }

}
