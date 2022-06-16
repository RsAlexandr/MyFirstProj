package Lesson6;

public class CheckNumber {
    boolean isEven(int x) {
        if ((x % 2) == 0) return true;
        else return false;
    }


    boolean isDivider(int deliteli, int delimoe){
        if ((delimoe % deliteli) == 0) return true;
        else return false;
    }
}
