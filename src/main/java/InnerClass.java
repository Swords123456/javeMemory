public class InnerClass {

    static class Change{
        public void change(){
            System.out.println("Changing");
        }
    }

    public void make(){
        class creation{
            public void creation(){
                System.out.println("creating");
            }
        }
    }
}
