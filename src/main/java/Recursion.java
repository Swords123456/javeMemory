public class Recursion {

    public Recursion(){
        System.out.println(calculate(4));

    }

    public int calculate(int value){

        System.out.println(value);

        if(value == 1) {
            return 1;
        }

        return calculate(value - 1) * value;
    }
}
