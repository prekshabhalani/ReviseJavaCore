class A {

  public void a() {
    System.out.println("In class A");
  }
}
class B extends A {

  public void a() {
    System.out.println("In class B");
  }
}
class C {

  public void a() {
    System.out.println("In class C");
  }
}

/**
 * dynamicMethodDispatch
 */

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new B();
        obj.a();

    }
}
