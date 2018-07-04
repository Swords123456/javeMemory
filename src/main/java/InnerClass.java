public class InnerClass {

    static class Change{
        public static void change(){
            System.out.println("Changing");
        }
    }

    public void make(){
        class creation{
            public void  creation(){
                System.out.println("creating");
            }
        }
    }
}
