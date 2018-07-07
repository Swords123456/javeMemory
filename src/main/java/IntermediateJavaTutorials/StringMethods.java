package IntermediateJavaTutorials;

/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */

public class StringMethods {

    public static void main(String[] args) {
        String[] words = {"funk", "chunk", "furry", "baconator"};

        for(String w : words){
            if(w.startsWith("fu")) System.out.println(w + " starts with fu");
        }

        for(String w : words){
            if(w.endsWith("unk")) System.out.println(w + " ends with unk");
        }


        /*                            other                            */

        String a = "Bacon";
        String b = " monster               ";

        //Inefficient
        System.out.println(a + b);

        //Efficient
        System.out.println(a.concat(b));

        //replace
        System.out.println(a.replace('B', 'F'));
        //Uppercase Lowecase
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());

        //trim the spaces between
        System.out.println(b.trim());
    }
}
