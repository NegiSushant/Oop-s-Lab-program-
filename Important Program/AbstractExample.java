public class AbstractExample {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();
        son.normal();

        Parent daughter = new Daughter(28);
        daughter.career();
        Parent.hello();
//        Parent mom = new Parent(45);
    }
}

abstract class Parent {
    int age;
    final int VALUE;
    public Parent(int age) {
        this.age = age;
        VALUE = 32456789;
    }
    static void hello(){
        System.out.println("hey");
    }
    void normal() {
        System.out.println("this is a normal method");
    }
    abstract void career();
    abstract void partner();
}
class Son extends Parent {
    public Son(int age) {
        super(age);
    }
    @Override
    void normal() {
        super.normal();
    }
    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }
    @Override
    void partner() {
        System.out.println("I love Pepper Potts");
    }
}

class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am going to be a coder");
    }
    @Override
    void partner() {
        System.out.println("I love Iron Man");
    }
}
