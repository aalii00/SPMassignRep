public class Operations {
  static void displaySquare(int n) {
        int j = n * n;
        System.out.println(j);
    }
  static void displayIsEven(int n) {
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
  public static void main(String[] args){

    displaySquare(5);
    displayIsEven(8);

  }
}
