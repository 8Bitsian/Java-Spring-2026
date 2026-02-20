public class Debug4_Combined {
  public static void main(String[] args) {
    /* 
      int count = 0;
      // Loops 19 times
      for (int i = 1; i < 20; i++) {
        // i % 2 determines if even OR i % 3 determines factors of 3
        if (i % 2 == 0 || i % 3 == 0) {
          count++; // Count is 12
        }
      }
      System.out.println("Count: " + count);
    */

    int count = 0;
    for (int i = 1; i < 20; i++) {
      
      if (i % 2 == 0 || i % 3 == 0) {
        count++;
      }
    }
    
    System.out.println("Count: " + count);
  }
}
