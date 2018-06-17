package Machines.info;

import Machines.info.Info;

import java.util.Map;
import java.util.Objects;

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
        if(this.equals(this)){
            //continue
        }
    }

    //Hash code method
    @Override
    public int hashCode() {

        return Objects.hash(id, engineVersion, height);
    }

    //Custom equals method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Machine machine = (Machine) o;
        return id == machine.id &&
                Float.compare(machine.engineVersion, engineVersion) == 0 &&
                height == machine.height;
    }
}