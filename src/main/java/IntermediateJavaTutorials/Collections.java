package IntermediateJavaTutorials;

/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {


    public static void main(String[] args){
        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<String>();

        for(String x:things){
            list1.add(x);
        }

        String[] moreThings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<String>();

        for(String y: moreThings){
            list2.add(y);
        }

        for(int i = 0; i < list1.size(); i++){
            System.out.printf("%s ", list1.get(i));
        }
        
        editList(list1, list2);
        System.out.println();
        for(int i = 0; i < list1.size(); i++){
            System.out.printf("%s ", list1.get(i));
        }
    }

    private static void editList(List<String> list1, List<String> list2) {
        //Iterator goes threw each array, item by item.
        Iterator<String> it = list1.iterator();

        while (it.hasNext()){
            if(list2.contains(it.next())){
                it.remove();
            }
        }
    }
}
