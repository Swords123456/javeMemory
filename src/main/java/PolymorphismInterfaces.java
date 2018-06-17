import Machines.info.Car;
import Machines.info.Info;
import Machines.info.Machine;
import Machines.info.Person;

public class PolymorphismInterfaces{

    public void Polymorphism(){
        //inheritence
        new Machine().start();
        new Car().start();

        //Polymorphism.
        Machine mw = new Car();

        //uses the car method. cant uses any new car methods
        mw.stop();



    }
    public void Interface(){
        //interfaces
        Machine m = new Machine();
        Person pe = new Person("Joe");

        m.start();
        pe.greet();

        Info info = new Machine();
        info.showInfo();

        Info info1 = pe;
        showInfo(m);
        showInfo(pe);
    }

    //Shows info for all objects that implements interface
    public static void showInfo(Info info){

    }
}
