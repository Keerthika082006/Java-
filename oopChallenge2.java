class vechile{
    String brand;
    int year;
    
    void startEngine(){
        System.out.println("the engine starts");
    }}

class car extends vechile{
    String fuelType;
    //override
    void startEngine(){
        System.out.println("the engine starts");
    }
    void drive(){
        System.out.println("car is driving");
    }}

 class truck extends vechile {
    String loadCapacity;
    //override
    void startEngine(){
        System.out.println("truck engine");
    }
    void haul(){
        System.out.println("the truck in hauling");
    }}

public class oopChallenge2 {
    public static void main(String[] args) {
        truck ob = new truck();
        ob.brand="maruthi";
        ob.year=2024;
        ob.loadCapacity= "1 tone";
        //ob.fuelType="petrol";
        ob.startEngine();
        ob.haul();
        //ob.drive();
        System.out.println(ob.brand);
        System.out.println(ob.year);
        //System.out.println(ob.fuelType);
        System.out.println(ob.loadCapacity);
    }
    
}
