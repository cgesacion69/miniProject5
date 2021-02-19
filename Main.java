import java.util.Scanner;

public class Main {
  static int myMethod(int x) {
    return 5 + x;
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println(myMethod(3));

    int result = sum(10);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
