import java.io.*;
import java.util.Scanner;

public class fileAndException implements AutoCloseable{

    public fileAndException() throws FileNotFoundException {

        try {
            throwException();
        } catch (serverException e) {
            e.printStackTrace();
        }

        //scanner
        String fileDir = "example.txt";

        File file = new File(fileDir);

        Scanner in = new Scanner(file);

        int value = in.nextInt();

        in.nextLine();


        System.out.println("The value is " + value);

        while (in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(line);
        }

        in.close();

        files();
    }

    public void files() {
        //file Reader
        String fileDir = "/Users/ibrahimhizamul/IdeaProjects/javeMemory/example.txt";
        File file = new File(fileDir);

        //Try and catch
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line;

            while((line = br.readLine()) != null){
                System.out.println(line);
            }

            br.close();

            System.out.println(line);
        }catch (FileNotFoundException e){
            //Custom exception message
            System.out.println("File not found!" + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
            //Finally will execute when they try and catch finishes even if there is and exception
        }finally {
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void throwException() throws serverException{
        int code = 0;

        if(code != 0){
            //Throw exception
            throw new serverException("Couldn't connect to server");
        }

        System.out.println("Running successful");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing");
    }
}

//Runtime exceptions dont have to be handled
//Custom Exception

class serverException extends Exception{
    public serverException(String st){
        super(st);
    }
}

class fileWrite extends Exception{
    public fileWrite(){
        File file = new File("text.txt");

        //Creates a new file
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedWriter w = new BufferedWriter(new FileWriter(file))){
            for(int c = 0; c < 10; c++){
                w.write("Welcome to this new world!");
                w.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}