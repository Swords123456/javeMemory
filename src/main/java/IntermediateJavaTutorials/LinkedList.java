package IntermediateJavaTutorials;

/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */

import java.util.List;
import java.util.ListIterator;

public class LinkedList {

    public static void main(String[] args){
        String[] things = {"apples", "noobs", "pgwne", "bacon", "goATS"};
        List<String> list1 = new java.util.LinkedList<String>();
        for(String x:things)
            list1.add(x);

        String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
        List<String> list2 = new java.util.LinkedList<String>();
        for (String y : things2)
            list2.add(y);

        list1.addAll(list2);
        list2 = null;

        printMe(list1);
        removeStuff(list1, 2, 5);
        printMe(list1);
        reverseMe(list1);
    }

    private static void removeStuff(List<String> list1, int i, int i1) {
        list1.subList(i, i1).clear();
    }

    private static void reverseMe(List<String> list1) {
        ListIterator<String> dan = list1.listIterator(list1.size());
        while (dan.hasPrevious()){
            System.out.printf("%s ", dan.previous());
        }
    }

    private static void printMe(List<String> list1) {
        for(String b : list1){
            System.out.printf("%s ", b);
        }
        System.out.println();
    }
}
