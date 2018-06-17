import Machines.info.Info;
import Machines.info.Machine;

import java.util.ArrayList;

public class Generics {

    //No generics in this
    ArrayList list = new ArrayList();

    //generic is a string
    ArrayList<String> strings = new ArrayList<>();

    ArrayList<Machines.info.Machine> Machines = new ArrayList<>();

    //Wildcard arraylist
    ArrayList<?> WildCard = new ArrayList<>();

    //Wildcard that must extend machines arraylist
    ArrayList<? extends Machine> MachineCard = new ArrayList<>();

    //Wildcard that must be a parent of machines arraylist
    ArrayList<? super Machine> Machine = new ArrayList<>();

    //Wildcard object
    Object obj = new Object();

    public void hi(){
        //returns a string because of generics
        strings.get(1);

        //returns an object so you would have to cast to a string
        list.get(1);

        //Anonymous classes
        Machine machine = new Machine(){
            @Override
            public void start(){

            }
        };

        Info info = new Info() {
            @Override
            public void showInfo() {
                System.out.println("Plant growing");
            }
        };
    }
    public static void showList(){

    }
}
