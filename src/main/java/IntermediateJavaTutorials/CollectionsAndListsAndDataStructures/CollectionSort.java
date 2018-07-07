package IntermediateJavaTutorials.CollectionsAndListsAndDataStructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
    public static void main(String[] args){
        String[] crap = {"apples", "lemons", "geese", "laptop", "youtube"};
        List<String> l1 = Arrays.asList(crap);
        Collections.sort(l1);

        System.out.printf("%s\n", l1);

        Collections.sort(l1, Collections.reverseOrder());
        System.out.printf("%s\n", l1);
    }
}
