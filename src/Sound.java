import java.util.Scanner;

public class Sound {
    public static void main(String[] args) {

        double speed = 343; //скорость звука 343 м/с
        double time = 7.2;
//        double distance = speed * time;
//        System.out.println("Расстояние до места удара молнии равняется " + distance + " метрам или " + distance / 1000 + " километрам");
        double distance = speed * (time / 2);

        System.out.println("Расстояние до скалы равняется " + distance + " метрам");



    }
}
