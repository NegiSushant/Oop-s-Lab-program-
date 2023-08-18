class MyThread implements Runnable{
    public void run(){
        System.out.println("Hello World");
    }
}
public class ImplimentThrade {
    public static void main(String[] args) {
        Runnable r1 = new MyThread();
        Thread t1 = new Thread(r1, "My");
        t1.start();

        String str = t1.getName();
        System.out.println(str);
    }
}
