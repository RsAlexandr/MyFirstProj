package Lesson6;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg; // расход топлива

    Vehicle(int numberOfPassangers, int fuelCapValue, int milesPerGallon) {
        passengers = numberOfPassangers;
        fuelcap = fuelCapValue;
        mpg = milesPerGallon;

    }

    void range(){
        System.out.println("Maximum distance with full fuelcap is " + fuelcap * mpg + " miles");
    }

   int rangeInt() {
        return mpg * fuelcap;
   }

   double fuelNeeded(int distance){
        return (double) distance / mpg;
   }


}
