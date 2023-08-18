public class ThrowExample {
    static void validate(int age){
        if(age < 18){
            throw new ArithmeticException("Not Eligible");
        }else{
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        validate(14);
    }
}
