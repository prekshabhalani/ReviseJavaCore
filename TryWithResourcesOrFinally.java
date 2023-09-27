import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourcesOrFinally {

  public static void main(String[] args) throws IOException {
    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader bf = null;
    try {
      bf = new BufferedReader(ir);
      System.out.print("Enter Another Number ");
      String s = bf.readLine();
      System.out.println("Last Entered number is " + s);
    } finally {
      //Most used for close sentences
      System.out.println("Fir milenge chalte chalte....");
        // bf.close();
    }
    try (BufferedReader bf1 = new BufferedReader(ir)) {
      System.out.print("Enter Number ");
      String s = bf1.readLine();
      System.out.println("Entered number is " + s);
    }

    
  }
}
