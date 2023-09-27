/**
 * ObjectMethodsClass
 */
class ObjectMethodsClass {

  public int num = 10;

  public void config() {
    System.out.println("in upper layer config method");
  }

  /**
   * InnerObjectMethodClass
   */
  public static class InnerObjectMethodClass {

    public void config() {
      System.out.println("In a config method");
    }
  }
}

public class ObjectMethods {

  public static void main(String[] args) {
    System.out.println("Very far, good work");

    ObjectMethodsClass omc = new ObjectMethodsClass();

    //access of inner class
    // ObjectMethodsClass.InnerObjectMethodClass iomc = omc.new InnerObjectMethodClass();

    //Access of inner static class
    ObjectMethodsClass.InnerObjectMethodClass obj = new ObjectMethodsClass.InnerObjectMethodClass();
    omc.config();
    obj.config();
    System.out.println(" Get-Class method - " + obj.getClass());
    System.out.println("To-String method - " + obj.toString());
    System.out.println("Has-Code method - " + obj.hashCode());
    System.out.println("Simple object - " + obj); //Auto to string is there
  }
}
