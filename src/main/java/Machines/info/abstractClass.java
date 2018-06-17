package Machines.info;

public abstract class abstractClass {

    //Abstract classes can contain methods
    int id;
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    //Abstract method like interfaces
    public abstract void start();

}
