public class StingBuilder {
    public StingBuilder(){

        //Inefficient
        String info = "";
        info += "My name is Bob";
        info += " ";
        info += "I am a builder";

        System.out.print(info);

        //efficient
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is %name%");
        sb.append(" ");
        sb.append("I am a %job%");
        System.out.print(sb.toString());

        StringBuilder sb1 = new StringBuilder("");

        sb1.append("My name is Roger")
        .append(" ")
        .append("I am a hi");
        System.out.print(sb.toString());


        //Thread safe!
        StringBuffer sbu = new StringBuffer();
        sbu.append("hey");

        // \n newline  \t tab line
        System.out.print("Hey");
        System.out.printf("hey my name %10 is %d and %f\n", 5, 0.8);

    }

    //custom toString method
    public String toString(){
        return "hi";
    }
}
