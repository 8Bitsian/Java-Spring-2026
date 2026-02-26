public class Debug3_Switch.java {
  public static void main(String[] args) {
    /* 
      int grade = 2;
      switch (grade) {
        case 1: System.out.println("A"); // There are no break; keywords
        case 2: System.out.println("B");
        case 3: System.out.println("C");
        case 4: System.out.println("D");
        case 5: System.out.println("F");
        default: System.out.println("Invalid");
      }
    */

    int grade = 2;
    switch (grade) {
      case 1: System.out.println("A"); break;
      case 2: System.out.println("B"); break; // Only prints "B"
      case 3: System.out.println("C"); break;
      case 4: System.out.println("D"); break;
      case 5: System.out.println("F"); break;
      default: System.out.println("Invalid");
    }
  }
}
