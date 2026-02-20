// Imani Hollie 02/19/2026

public class GradeDebug2 {
  public static void main(String[] args) {
    /*
      int score = 75;
      int attendance = 70;
      // T OR T = T; T OR F = T; F OR T = T; F OR F = F;
      if (score >= 60 || attendance >= 80) {
        System.out.println("Student passes."); // Prints student passes
      } else {
        System.out.println("Student fails.");
      }
    */
    
    int score = 75;
    int attendance = 70;
    // T AND T = T; T AND F = F; F AND T = F; F AND F = F; 
    if (score >= 60 && attendance >= 80) {
      System.out.println("Student passes.");
    } else {
      System.out.println("Student fails.");
    }
    
  }
}
