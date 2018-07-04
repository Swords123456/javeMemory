

/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */

import Machines.info.Info;

public class InterfaceComparable implements Comparable<InterfaceComparable> {
    int numberOfPages;
    String title;
    String author;

    @Override
    public int compareTo(InterfaceComparable o) {
        if(this.numberOfPages != o.numberOfPages){
            return this.numberOfPages - o.numberOfPages;
        }

        if(!this.title.equals(o.title)){
            return this.title.compareTo(o.title);
        }
        return this.author.compareTo(o.author);
    }
}
