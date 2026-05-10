public class Operations {
  public static void main(String[] args){
    int total = calculateSum(5, 3);   
    int max = getMaxValue(5, 3); 
    System.out.println(total);
    System.out.println(max);
  }
public static int calculateSum(int a, int b) {
    return a + b;
}
public static int getMaxValue(int a, int b) {
    return Math.max(a, b);
}
  
}



