package Machines.info;

import Machines.info.Info;

import java.io.Serializable;

public class Person implements Info, Serializable {

    private static final long serialVersionUID = 3023023032023L;
    private String name;

    public void greet(){
        System.out.println("Hey there");
    }

    int id;

    public Person(String name, int id){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void showInfo() {
        System.out.println("Person name is " + name);
    }
}
