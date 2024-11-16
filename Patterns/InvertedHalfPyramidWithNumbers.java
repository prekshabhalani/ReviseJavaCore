package Patterns;

import java.util.Scanner;

public class InvertedHalfPyramidWithNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of row: ");
    int row = sc.nextInt();
   
    for (int i = row; i > 0; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
