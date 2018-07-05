

/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */

class Encapsulation {
    private int num;


    //these methods to get the num.
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

class abstracts implements interfaces{

    @Override
    public void start() {
        System.out.println("This is being started");
    }
}

class abstraction implements interfaces{

    @Override
    public void start() {
        System.out.println("This has started");
    }
}

interface interfaces {
    void start();
}