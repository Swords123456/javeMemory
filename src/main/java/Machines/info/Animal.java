package Machines.info;


public enum Animal {
    //Register all the enum variable
    CAT("Cloud"), DOG("Fluffy"), MOUSE("Jerry");

    private String name;

    Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "Animal type: " + this.name() + ", Animal name: " + name;
    }
}
