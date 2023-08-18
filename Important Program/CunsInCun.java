public class CunsInCun {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.marks);
    }


}
class Student{
    int roll;
    String name;
    float marks;

    Student(){
//        this();
        this (156, "Sushant", 78.9f);
    }

    Student(int r, String n){
        this.roll = r;
        this.name = n;
    }
    Student(int rno, String naam, float m){
        this.roll = rno;
        this.name = naam;
        this.marks = m;
    }
}