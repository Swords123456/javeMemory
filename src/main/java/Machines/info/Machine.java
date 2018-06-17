package Machines.info;

import Machines.info.Info;

//implements interface
public class Machine implements Info {

    private int id = 7;

    //Can only be accessed in this class and sub classes and packages
    protected float engineVersion  = 1.4f;

    //Package level vissability
    int height;

    public void start(){
        System.out.println("Booting up...");
    }

    public void stop(){
        System.out.println("Shutting dow...");
    }

    public void showInfo() {
        System.out.println("Machine ID is "  +id);
    }
}