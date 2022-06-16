package Lesson6;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle mercedes = new Vehicle(5,16,21);
        Vehicle jeep = new Vehicle(7,25,15);

        mercedes.passengers = 5;
        mercedes.fuelcap = 16;
        mercedes.mpg = 21;

        int range = mercedes.fuelcap * mercedes.mpg;
        int range2 = jeep.fuelcap * jeep.mpg;
        System.out.println("Mercedes can take " + mercedes.passengers + " passengers.");
        mercedes.range();
        System.out.println("Mercedes can take " + jeep.passengers + " passengers.");
        jeep.range();

        int howMilesJeepCanGo = jeep.rangeInt();
        System.out.println("This is one from method rangeInt " + howMilesJeepCanGo);

        double gallons = jeep.fuelNeeded(700);
        int rangeNeeded = 1400;
        double gallons2 = mercedes.fuelNeeded(rangeNeeded);
        System.out.println("Jeep needs " + gallons + " galons");
        System.out.println("Mercedes needs " + gallons2 + " galons");





    }
}
