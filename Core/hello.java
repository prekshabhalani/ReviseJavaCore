package Core;

//Class Object and Method
class MathFunc {

  int a = 5;

  public int add(int a, int b) {
    System.out.println("In a Add");
    return a + b;
  }
}

class Hello {

  public static void main(String arg[]) {
    //hexa binary work fine  _ allow for number
    int intNum = 11;

    byte byteNum = 2;

    short shortNum = 3;

    long longNum = 4;

    double doubleNum = 5.6; //12e10

    float floatNum = 6.6f;

    boolean boolNum = true;

    char characterNum = 'Z' + 1; //b

    //casating auto casting  and  do moduler 257 % 256 total byte
    //type convertion promotion casting
    int result = byteNum = (byte) (intNum);
    int i = 1;
    //Looping
    while (i < result) {
      //Conditional
      if (result > i) {
        //System.out.println("Result is less then " + i + '<' + result);
      } else {
        //System.out.println("Result is less then " + i + '>' + result);
      }
      MathFunc mathOb = new MathFunc();
      int result2 = mathOb.add(i, result);
      System.out.println(
        "Result update with" + i + "+" + result2 + "=" + mathOb.add(result, i)
      );

      i++;
    }
  }
}
