/**
 * A
 */
class A {

  public final void authorName() { // Final to stop overriding
    System.out.println("Copyrights By Preksha");
  }

  public void mainA() {
    final int a = 5;
    //     a = 10; on varible to avoid value change
    System.out.println(a);
  }
}
final class B extends A{
//     public void authorName() { // Final to stop overriding
//     System.out.println("Try To Copyright");
//   } 
  public void mainA() {
    final int a = 5;
    //     a = 10; on variable to avoid value change
    System.out.println(a);
  }

}

// class C extends B{ // Final of B avoid inheritance 

// }
public class Final {

  public static void main(String[] args) {
    A obj = new A();
    obj.mainA();
  }
}
