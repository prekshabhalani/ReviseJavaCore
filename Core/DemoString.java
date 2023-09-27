package Core;
/**
 * InnerDemoString -  mutable and unMutable 
 */
class InnerDemoString {

  String name = "Preksha"; // Have address 1
  StringBuffer namBuffer = new StringBuffer("Preksha"); // Have address 2
  StringBuilder nameBuilder = new StringBuilder("Preksha"); // Have address xyz
}

class DemoString {

  public static void main(String[] args) {
   
    InnerDemoString s1 = new InnerDemoString();

    //For STRING class value before opration
    System.out.println(
      "For " +
      s1.name +
      "String address = " +
      Integer.toHexString(s1.name.hashCode())
    );
    s1.name = "Preksha Bhalani"; // address 3

    //For STRING after opration
    System.out.println(
      "For " +
      s1.name +
      "String address = " +
      Integer.toHexString(s1.name.hashCode())
    );

        //For STRING BUFFER before opration
    System.out.println(
      "For " +
      s1.namBuffer +
      "String Buffer address = " +
      Integer.toHexString(s1.namBuffer.hashCode())
    );
    s1.namBuffer.append(" Bhalani"); // address 2

    //For STRING BUFFER after opration
    System.out.println(
      "For " +
      s1.namBuffer +
      "String Buffer address = " +
      Integer.toHexString(s1.namBuffer.hashCode())
    );

        //For STRING BUILDER before opration
    System.out.println(
      "For " +
      s1.nameBuilder +
      "String nameBuilder address = " +
      Integer.toHexString(s1.nameBuilder.hashCode())
    );
    s1.nameBuilder.append(" Bhalani"); // address 2

    //For STRING BunameBuilder after opration
    System.out.println(
      "For " +
      s1.nameBuilder +
      "String nameBuilder address = " +
      Integer.toHexString(s1.nameBuilder.hashCode())
    );
  }
}
