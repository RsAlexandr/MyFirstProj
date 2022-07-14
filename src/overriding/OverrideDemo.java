package overriding;

public class OverrideDemo {
    public static void main(String[] args) {

        B subObject = new B(1, 2, 3);


        subObject.show();

    Super superObj = new Super();
    Sub1 subObj1 = new Sub1();
    Sub2 subObj2 = new Sub2();

    Super superReference;
    superReference = superObj;


    }
}