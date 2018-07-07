package IntermediateJavaTutorials;

import java.nio.charset.CharsetEncoder;

public class GenericMethods {
    public static void main(String[] args){

        Integer[] iray = {1, 2, 3 ,4};
        Character[] cray = {'b', 'u', 'c', 'y'};

        printMe(iray);
        printMe(cray);

        System.out.println(max(23, 41, 89));
        System.out.println(max("programs", "methods", "chicken"));

    }

    /*private static void printMe(Integer[] iray) {
        for(Integer x : iray){
            System.out.printf("%s ", x);
        }
        System.out.println();
    }
    private static void printMe(Character[] iray) {
        for(Character x : iray){
            System.out.printf("%s ", x);
        }
        System.out.println();
    }*/

    private static <T> void printMe(T[] x){
        for(T b :x){
            System.out.printf("%s ", b);
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c){
        T m = a;

        if(b.compareTo(a) > 0)
            m = b;
        if(c.compareTo(m) > 0)
            c = m;
        return m;
    }
}
