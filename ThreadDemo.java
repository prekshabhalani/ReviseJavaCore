/**
 * AThread
 */
class AThread extends Thread{
    public void run() {
        for (int i =0; i<=100; i++) {
            System.out.println("first");   
        }
    }
}
/**
 * BThread
 */
class BThread extends Thread{
    public void run(){
        for (int i =0; i<=100; i++) {
            System.out.println("Second");   
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
            AThread at = new AThread();
            BThread bt = new BThread();

            at.setPriority(Thread.MIN_PRIORITY);
            at.start();
            bt.start();
            bt.setPriority(Thread.MAX_PRIORITY);
    }    
}
