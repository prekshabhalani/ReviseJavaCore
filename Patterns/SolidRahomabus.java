package Patterns;

import java.util.Scanner;

public class SolidRahomabus {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();

    for (int i = 0; i < rows; i++) {
      for (int j = i; j < rows; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < rows; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
