package Patterns;

import java.util.Scanner;

public class InvertedAndRotedHalfPyramid {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of row: ");
    int row = sc.nextInt();

    for (int i = 1; i <= row; i++) {
      for (int j = 0; j < row - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = row; i >= 1; i--) {
      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j <= row - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
