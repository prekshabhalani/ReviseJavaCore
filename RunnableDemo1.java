class A {

  public static void fun() {
    System.out.println("Let do more practice then....");
  }
}

public class RunnableDemo1 {

  public static void main(String[] arg) {
    System.out.println("Good one");
    Runnable r = () -> {
      for (int i = 0; i <= 10; i++) {
        System.out.println("Preksha you are grate candidate on your on.");
      }
      A.fun();
    }; //Run method on lambda form
    Thread t1 = new Thread(r);
    t1.start();
  }
}
