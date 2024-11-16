package Patterns;

import java.util.Scanner;

public class Floyed_Tringle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of row: ");
    int row = sc.nextInt();
    int count = 1;
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(count++ + " ");
      }
      System.out.println();
    }
  }
}
