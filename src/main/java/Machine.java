
//implements interface
public class Machine implements Info{

    private int id = 7;

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