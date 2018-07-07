package IntermediateJavaTutorials.CollectionsAndListsAndDataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddAllCollections {
    public static void main(String[] args){
        //convert stuff arrasy to a list;
        String[] stuff = {"Apples", "Banana", "mango", "orange"};
        List<String> list1 = Arrays.asList(stuff);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Youtube");
        list2.add("Google");
        list2.add("Discord");

        for(String x : list2)
            System.out.printf("%s ", x);

        Collections.addAll(list2, stuff);
        System.out.println();
        for(String x : list2)
            System.out.printf("%s ", x);

        System.out.println();
        System.out.println(Collections.frequency(list2, "Youtube"));

        boolean tof = Collections.disjoint(list1, list2);
        System.out.println(tof);

        if(tof){
            System.out.println("Nothing in common!");
        }else {
            System.out.println("Something in common.");
        }
    }
}
