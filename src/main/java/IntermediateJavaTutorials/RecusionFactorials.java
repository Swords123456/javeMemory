package IntermediateJavaTutorials;

/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */

public class RecusionFactorials {

    public static void main(String[] args){
        System.out.println(fact(5));
    }

    public static long fact(long n){
        if(n <=1){
            return 1;
        }else {
            return n * fact(n - 1);
        }
    }
}
