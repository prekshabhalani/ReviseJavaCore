package Patterns;

import java.util.Scanner;

public class HalfPyramid {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of row: ");
    int row = sc.nextInt();
    // System.out.print("Enter the number of colum: ");
    // int col = sc.nextInt();
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print('*');
      }
      System.out.println();
    }
  }
}
