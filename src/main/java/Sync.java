

/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */

public class Sync {
    //this is a random number, its not in sync
    public static int numbers;

    public static void start(){
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 10000; i++){
                addNumbers();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 10000; i++){
                removeNumbers();
            }
        });
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
            System.out.println(numbers);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void addNumbers(){
        numbers++;
    }
    public static void removeNumbers(){
        numbers--;
    }

    public static void main(String[] args){
        start();
    }
}


/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */

class Syncs {
    //this is 0, its in sync.

    public static int numbers;

    public static void start(){
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 10000; i++){
                addNumbers();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 10000; i++){
                removeNumbers();
            }
        });
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
            System.out.println(numbers);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized static void addNumbers(){
        numbers++;
    }
    public synchronized static void removeNumbers(){
        numbers--;
    }

    public static void main(String[] args){
        start();
    }
}
