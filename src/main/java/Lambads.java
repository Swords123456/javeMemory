

/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */

public class Lambads {
    public static void main(String[] args) {
        Lamb isEven = (n) -> (n % 2) == 0;
        Lamb isNegative = (n) -> (n < 0);

        System.out.println(isNegative.processName(-1));
        System.out.println(isEven.processName(-2));

        MyGreeting morningGreeting = (str,time) -> "Good Morning " + str + "! It is " + time + " o'clock";
        MyGreeting eveningGreeting = (str,time) -> "Good Evening " + str + "! It is " + time + " o'clock";

        // Output: Good Morning Luis!
        System.out.println(morningGreeting.processName("Luis", 5.00));

        // Output: Good Evening Jessica!
        System.out.println(eveningGreeting.processName("Jessica", 5.00));
    }
}
interface Lamb{
    boolean processName(int n);
}
interface MyGreeting {
    String processName(String str, double t);
}