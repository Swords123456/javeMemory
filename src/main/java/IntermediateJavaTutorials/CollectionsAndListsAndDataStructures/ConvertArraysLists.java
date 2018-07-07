package IntermediateJavaTutorials.CollectionsAndListsAndDataStructures;

import java.util.Arrays;
import java.util.LinkedList;

public class ConvertArraysLists {
    public static void main(String[] args) {
        String[] stuff = {"babies", "watermelong", "melones", "fudge"};
        LinkedList<String> theList = new LinkedList<String>(Arrays.asList(stuff));

        theList.add("pumpkin");
        theList.addFirst("First");

        /*                                  Convert back to array                                         */
        stuff = theList.toArray(new String[theList.size()]);

        for (String x : stuff){
            System.out.printf("%s ", x);
        }
    }
}
