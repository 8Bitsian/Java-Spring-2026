public class PrintGradeWithVoid {
  public static void main(String[] args) {
    System.out.print("The grade is ");
      printGrade(93.1);
    System.out.print("The grade is ");
      printGrade(78.0);
    System.out.print("The grade is ");
      printGrade(56.2);
  }
  
  public static void printGrade(double score) {
    if (score < 0 || score > 100) {
      System.out.println("ERROR: Invalid Input - Score must be between 0 - 100.");
      return;
    }
    
    if (score >= 90.0) {
      System.out.println('A');
    } else if (score >= 80.0) {
      System.out.println('B');
    } else if (score >= 70.0) {
      System.out.println('C');
    } else if (score >= 60.0) {
      System.out.println('D');
    } else {
      System.out.println('F');
    }
  }
}
