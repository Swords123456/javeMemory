package Machines.info;

public class Camera extends Machine {
    @Override
    public void start() {
        System.out.println("Camera started");
    }

    public void snap() {
        System.out.println("Camera took a photo");
    }
}
