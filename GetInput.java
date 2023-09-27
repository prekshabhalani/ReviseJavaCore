import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) throws IOException {

        //One way manually
        // int a = System.in.read();
        // System.out.println(a - 48);
        
        //Second way
        // InputStreamReader iReader = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(iReader);
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close();

        //Third way
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        a = sc.nextInt();
        System.out.println(a);
    }
}
