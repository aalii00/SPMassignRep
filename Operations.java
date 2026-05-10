public class Operations {
  public static void main(String[] args){
    int k = 10;
    int m = 3;
    System.out.println(subtract(k,m));

    int minutes = 120;
    System.out.println(min_to_hour(minutes));


    
  }
public static int subtract(int x, int y) {
    return x - y;
  }
  public static int min_to_hour(int minutes) {
    return minutes / 60;
  }
  
}



