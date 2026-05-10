public class Operations {
  public static void main(String[] args) {

    displaySquare(5);
    displayIsEven(8);

    int k = 10;
    int m = 3;
    System.out.println(subtract(k, m));

    int minutes = 120;
    System.out.println(min_to_hour(minutes));
  }

  static void displaySquare(int n) {
    System.out.println(n * n);
  }

  static void displayIsEven(int n) {
    if (n % 2 == 0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
  }

  public static int subtract(int x, int y) {
    return x - y;
  }

  public static int min_to_hour(int minutes) {
    return minutes / 60;
  }
}



