package Machines.info;

import Machines.info.Info;

public class Person implements Info {

    private String name;

    public void greet(){
        System.out.println("Hey there");
    }

    int id;

    public Person(String name, int id){
        this.id = id;
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Person name is " + name);
    }
}
