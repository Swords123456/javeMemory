import Machines.info.Camera;
import Machines.info.Machine;

public class UpcastingAndDowncasting {
    public UpcastingAndDowncasting(){
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        //upCasting
        Machine machine2 = camera1;
        machine2.start();

        //downCasting
        Machine machine3 = new Camera();
        Camera camera2 = (Camera) machine3;
        camera2.start();
        camera2.snap();
    }
}
