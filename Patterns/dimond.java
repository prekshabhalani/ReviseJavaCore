package Patterns;

public class dimond {

  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= 2 * n - 1; i++) {
      int stars = i <= n ? i : (n * 2) - i;
      int spaces = n - stars;

      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= stars; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
