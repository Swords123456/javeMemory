import java.util.Scanner;


/*
* private - can only be acceced in the same class
* public - can be accessed from anywhere
* protected - can be accessed from sub-classes, packages and the same class
* no modifier - can only be accessed from the same package
* */

public class Application {

    //Public variable been declared!
    int p = 0;

    //only this class can access this variable
    private int diamater = 1;

    //other this class can access this variable
    public int coolness = 1;

    public static void main(String[] args){

        /*     Casting     */

        float a = 5.6f;
        int aToInt = (int) a;

        //float is now an int

        /*                   String builder                     */
        new StingBuilder();

        //Prints out a line.
        System.out.println("Hello Word!");

        //private variable declared here!
        int p = 0;

        //get scanner from console
        Scanner sc = new Scanner(System.in);

        //prints something
        System.out.println("Enter a string");

        //gets the new input
        String l = sc.nextLine();

        //print the string
        System.out.println(l);

        //repeated. While repeats code until the condition is met.
        double s = Math.floor(Math.random() * 5);
        while (s < 1){
            s = Math.floor(Math.random() * 5);
            System.out.println("Hey");
        }

        //Executes the code first, then checks
        do{
            double sr = Math.floor(Math.random() * 5);
            System.out.println("Hey");
        }while (s < 1);

        //calling a method
        switch1(l);
    }

    //a new method that contains parameters
    public static void switch1(String st){
        //a switch statement
        switch (st){
            case "start":
                System.out.println("hey");
                break;
            case "stop":
                System.out.println("hey1");
                break;
        }

        //an if statement
        if(st == "start"){
            //for loop
            for(int i = 0; i < 0; i++){
                //stuuf
            }
        }


        //arrays
        String[] st1 = {"hi", "there", "whats","up"};
        String[] st2 = new String[3];

        //bad practice
        for(int c = 0; c < st1.length; c++){
            //more stuff
        }

        //good practise
        for(String s: st1){
            //more stuff
        }

        //multidimensional arrays
        int[][] g = {
            { 0, 1, 2},
            { 23, 11, 1},
            { 230, 1123, 122}
        };

        //new instance access
        classes c = new classes();
        c.publics(st);

        //static access
        classes.statis(st);
    }

}
