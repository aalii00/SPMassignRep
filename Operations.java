public class Operations {
  public static void main(String[] args){
   displaySquare(5);
   displayIsEven(8);
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

  
}



