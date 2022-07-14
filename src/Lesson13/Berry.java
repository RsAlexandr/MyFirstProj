package Lesson13;

public class Berry {
    int weight;
    String name;
    String colour;
    boolean isRipe;  // перевод - СПЕЛЫЙ


    Berry(String name){
        this.name = name;
        isRipe = false;
        colour = "undefined";
        weight = 0;
    }

    Berry(String name, boolean isRipe){
        this.name = name;
        this.isRipe = isRipe;
        colour = "undefined";
        weight = 0;
    }

}
