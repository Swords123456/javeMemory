import Machines.info.Person;

import java.io.*;

public class Serialization {
}
class WriteObjects{
    public static void main(String[] args){
        System.out.println("Writing object");

        Person mike = new Person("Mike", 1442);
        Person sue = new Person("Sue", 139);

        try(FileOutputStream fs = new FileOutputStream("people.bin")){

            ObjectOutputStream os =new ObjectOutputStream(fs);

            os.writeObject(mike);
            os.writeObject(sue);

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(mike);
        System.out.println(sue);
    }
}
class ReadObject{
    public static void main(String[] args){
        System.out.println("Read objects");

        try(FileInputStream fi = new FileInputStream("people.bin")){
            ObjectInputStream os = new ObjectInputStream(fi);

            Person person1 = (Person) os.readObject();
            Person person2 = (Person) os.readObject();

            os.close();

            System.out.println(person1.toString());
            System.out.println(person2.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}