import Machines.info.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SerializationMultipleObjects {
}

class WriteMultipleObjects{
    public static void main(String[] args){
        System.out.println("Writing object");

        Person[] people = {new Person("Mike", 1442), new Person("Sue", 139)};

        ArrayList<Person> peoples = new ArrayList<>(Arrays.asList(people));

        Person mike = new Person("Mike", 1442);
        Person sue = new Person("Sue", 139);

        try(FileOutputStream fs = new FileOutputStream("people.bin")){

            ObjectOutputStream os =new ObjectOutputStream(fs);

            os.writeObject(people);

            os.writeObject(peoples);

            os.writeInt(peoples.size());

            for(Person person :peoples){
                os.writeObject(person);
            }

            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(mike);
        System.out.println(sue);
    }
}

class ReadMultipleObject{
    public static void main(String[] args){
        System.out.println("Read objects");

        try(FileInputStream fi = new FileInputStream("people.bin")){
            ObjectInputStream os = new ObjectInputStream(fi);

            Person[] person1 = (Person[]) os.readObject();


            @SuppressWarnings("unchecked")
            ArrayList<Person> persons = (ArrayList<Person>) os.readObject();

            for (Person person:person1){
                System.out.println(person.toString());
            }
            for (Person person:persons){
                System.out.println(person.toString());
            }

            int num = os.readInt();

            for(int i =0; num<i; i++){
                Person person = (Person)os.readObject();
                System.out.println(person.toString());
            }

            os.close();

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}