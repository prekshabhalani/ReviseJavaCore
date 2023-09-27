abstract class Actions extends human {
  public abstract void running();
}

/**
 * human
 */
class human  {

//   @Override
//   public void running() {
//     System.out.println("running");
//   }
}

public class Abstract {

  public static void main(String[] args) {
    human obj = new human();
    //Anonyms implementation
    Actions obj1 = new Actions() {
      public void running() {
        System.out.println("Anonyms running");
      }
    };
    // Actions obj2 = new human();
    // obj.running();
    obj1.running();
    // obj2.running();
  }
}
