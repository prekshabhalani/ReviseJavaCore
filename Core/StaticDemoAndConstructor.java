package Core;

/**
 * LightCheck
 */
class LightCheck {

  static boolean haveElectricity;
  String brand;
  int noOfBulbs;

  //Constructor called every time object initialized 
  //use same name as class
  //Special method to initialize the instance variables
  public LightCheck() {
    noOfBulbs = 1;
    haveElectricity = true; //we can do this  but why need to call this multiple time when it is static for all object
    System.out.println("Constructor has been called at address "+ this + "when object initialize");
    System.out.println("Constructor has been initialize the value noOfBulbs with"+ noOfBulbs);

  }
  //ALways called first because class load first
  //Only called once
  //use static keyword to call this
  static{
    haveElectricity = true;
    System.out.println("Static block has been called first when class load");
  }

}

public class StaticDemoAndConstructor {

  public static void main(String[] args) throws ClassNotFoundException {

    Class.forName("LightCheck");
    LightCheck street1LightCheck = new LightCheck();
    // street1LightCheck.haveElectricity = true;
    // LightCheck.haveElectricity = true;
    // street1LightCheck.brand = "XOOM";
    // street1LightCheck.noOfBulbs = 5;

    LightCheck street2LightCheck = new LightCheck();
    // street2LightCheck.haveElectricity = true;
    // LightCheck.haveElectricity = false;
    // street2LightCheck.brand = "EverSource";
    // street2LightCheck.noOfBulbs = 5;
  }
}
