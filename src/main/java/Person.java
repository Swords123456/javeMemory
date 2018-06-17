public class Person implements Info{

    private String name;

    public void greet(){
        System.out.println("Hey there");
    }

    public Person(String name){
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Person name is " + name);
    }
}
