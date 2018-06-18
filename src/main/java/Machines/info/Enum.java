package Machines.info;

public class Enum {
    public Enum(){
        //Referencing the enum
        Animal animal = Animal.CAT;

        //Check the enum for the cases
        switch (animal){
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                System.out.println("Mouse");
                break;
            default:
                break;
        }

        System.out.println(Animal.DOG);
        System.out.println("Enum name: " + Animal.DOG.name());

        System.out.println(Animal.DOG.getClass());
        System.out.println(Animal.DOG instanceof Animal);
        System.out.println(Animal.DOG.getName());

        Animal animal2 = Animal.valueOf("CAT");

        System.out.println(animal2);
    }
}
