package Core;


/**
 * InnerSuperDemo
 */
class InnerSuperDemo extends ParentInnerSuperDemo {

  public InnerSuperDemo() {
    // super(); ---Default it's there only
    this(5);
    System.out.println("Inner Super Demo");
  }

  public InnerSuperDemo(int a) {
    // super(); ---Default it's there only but override if we mention explicitly
    super(a);    // ?How can i call super and this or super with value
    System.out.println("Inner Super Demo => with parameter " + a);
  }
}

/**
 * ParentInnerSuperDemo
 */
class ParentInnerSuperDemo {

  public ParentInnerSuperDemo() {
    System.out.println("Parent Inner Super Demo");
  }

  public ParentInnerSuperDemo(int a) {
    System.out.println("Parent Inner Super Demo => with parameter " + a);
  }
}

public class SuperDemo {

  public static void main(String[] args) {
    InnerSuperDemo ob = new InnerSuperDemo();
  }
}
