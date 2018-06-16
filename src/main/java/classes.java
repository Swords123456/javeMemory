public class classes {

    //actualy dont do String name instead
    String name;

    //multiple constructors
    public classes(String st) {
        System.out.println("he");
        name = st;
    }

    //Can't be changed ever. pi = 5; wont work
    final double pi = 3.141592653585;

    public void publics(String st) {
        System.out.println("he");
        name = st;
    }

    public static void statis(String st) {
        System.out.println("he");
    }

    //Constructor, executed when the class is made
    public classes() {

    }

    //getters
    public String getName() {
        return name;
    }

    //setyers
    public void setName(String name) {
        this.name = name;
    }
}