package Machines.info;

//Inheritce machines methods and variables
public class Car extends Machine {
    //Overrides the stop method
    @Override
    public void stop() {
        System.out.println("Car of");
    }
}
