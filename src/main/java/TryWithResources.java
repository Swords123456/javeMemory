import java.io.*;

public class TryWithResources {

    public TryWithResources(){
        try(fileAndException file = new fileAndException()){

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void TryWithResources(){

        File file = new File("");

        try(BufferedReader r = new BufferedReader(new FileReader(file))){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
