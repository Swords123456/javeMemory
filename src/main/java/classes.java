public class classes {

    static String name;

    public static void publics(String st) {
        System.out.println("he");
        name = st;
    }

    //Constructor, executed when the class is made
    public classes() {

    }

    //getters
    public String getName() {
        return name;
    }

    //setyers
    public String setName(String name) {
        this.name = name;
    }
}