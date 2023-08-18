public class ThrowsExample {
    static void fun() throws IllegalAccessException{
        System.out.println("Inside function");
        throw new IllegalAccessException("Demo");
    }

    public static void main(String[] args) {
        try {
            fun();
        }catch (IllegalAccessException e){
            System.out.println("Caught in main");
        }
    }
}
