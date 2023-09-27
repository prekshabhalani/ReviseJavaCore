/**
 * A
 */
class A implements Runnable {

  public void run() {
    System.out.println("Hello");
  }
}

/**
 * B
 */
class B implements Runnable {

  public void run() {
    System.out.println("Hii");
  }
}

public class RunnableDemo {

  public static void main(String[] args) {
    Runnable ob = () -> System.out.println("?....Perfect");

    Runnable ob1 = new B();

    Thread t1 = new Thread(ob);
    Thread t2 = new Thread(ob1);
    t1.start();
    t2.start();
  }
}
