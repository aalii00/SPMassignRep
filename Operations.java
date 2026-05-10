public class Operations {
  public static void main(String[] args){
   
  }
public class Main {
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int getMaxValue(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int total = calculateSum(5, 3);
        int max = getMaxValue(5, 3);

        System.out.println("Total = " + total);
        System.out.println("Max = " + max);
    }
}
  
}



