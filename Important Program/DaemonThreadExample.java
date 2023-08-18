public class DaemonThreadExample extends Thread {
    public DaemonThreadExample(String name){
        super(name);
    }

    public void run(){
        if(Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon thread");
        } else {
            System.out.println(getName() + " is User thread");
        }
    }

    public static void main(String[] args) {
        DaemonThreadExample t1 = new DaemonThreadExample("t1");
        DaemonThreadExample t2 = new DaemonThreadExample("t2");
        DaemonThreadExample t3 = new DaemonThreadExample("t3");

        t1.setDaemon(true);

        t1.start();
        t2.start();

        t3.setDaemon(true);
        t3.start();
    }
}

