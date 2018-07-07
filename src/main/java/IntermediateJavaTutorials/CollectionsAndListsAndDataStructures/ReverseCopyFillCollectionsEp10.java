package IntermediateJavaTutorials.CollectionsAndListsAndDataStructures;

import java.util.*;
import java.util.Collections;

public class ReverseCopyFillCollectionsEp10 {
    public static void main(String[] args){
        //Creates an array and converts to a list;
        Character[] ray = {'l', 'm', 'a', 'o'};
        List<Character> l = Arrays.asList(ray);

        System.out.println("List is : ");
        output(l);

        //reverse and print out the list!
        Collections.reverse(l);
        System.out.println("After reverse : ");
        output(l);

        //copy list
        Character[] newRay = new Character[ray.length];
        List<Character> listCopy = Arrays.asList(newRay);
        Collections.copy( listCopy, l);
        System.out.println("Copy of list : ");
        output(listCopy);

        //fill collection with things
        Collections.fill(l, 'X');
        System.out.println("List fill : ");
        output(l);
    }

    private static void output(List<Character> l) {
        for (Character thing: l)
            System.out.printf("%s ", thing);
        System.out.println();
    }
}
