/* Imani Hollie 03/19/2026
   Lesson 8 Assignment: Create a dataset to store ad calculate students' exam scores for subject A, B, C in each semester.

   The code should have the following:
   - Utilize a 3-dimensional array:
     Name/Subject   A  B  C   A  B  C   A  B  C
     Student1       1  2  3   4  5  6   7  8  9
     Student2      10 11 12  13 14 15  16 17 18
     Student3      19 20 21  22 23 24  25 26 27
     Student4      28 29 30  31 32 33  34 35 36
     Student5      37 38 39  40 41 42  43 44 45
   - Allow the user to choose multiple semesters with 1 subject or 1 semester w/multiple subjects
   - Print out the corresponding average(s) of the selected exam score(s)

   Sample Output:
   Which semester? Fall(1), Spring(2), or Summer(3)? 2
   Which subject? A B
   Subject  Semester  Avergage
   A        Winter    **
   B        Winter    **
   Which semester? Fall(1), Spring(2), or Summer(3)? 1 2
   Which subject? C
   Subject  Semester  Avergage
   C        Fall      **
   B        Spring    **
   Which semester? Fall(1), Spring(2), or Summer(3)? 0
   Thank you.
*/

import java.util.Scanner;

public class J108_2 {
   // Global Constants and Arrays
   private static final int STUDENTS = 5;
   private static final int SEMESTERS = 3;  // Fall = 1, Spring = 2, Summer = 3
   private static final int SUBJECTS = 3;   // A = 0, B = 1, C = 2
   private static final int[][][] scores = new int[STUDENTS][SEMESTERS][SUBJECTS];

   // Fill in the array column-wise
   public static void genArr() {
      int value = 1;
      // Outermost loop: Columns first (column-wise filling)
      for (int student = 0; student < STUDENTS; student++) {
         // Outer loop: Column second
         for (int semester = 0; semester < SEMESTERS; semester++) {
            // Inner loop: Row third
            for (int subject = 0; subject < SUBJECTS; subject++) {
               scores[student][semester][subject] = value;
               value++; // Move to next subject
            }
         }
      }
   }

   // Get user input
   public static void getSemsters(String prompt, Scanner input) {
      System.out.print(prompt);
      String line = input.nextLine();
      return line.split(" ");
   }

   // Convert semester number to name
   public static String semName(int sem) {
      if (sem == 1) return "Fall";
      if (sem == 2) return "Spring";
      return "Summer";
   }

   // Convert subject letter to index
   public static int subIndex(char c) {
      if (c == 'A' || c == 'a') return 0;
      if (c == 'B' || c == 'b') return 1;
      return 2;
   }
   // Calculate the average for one semester per subject
   public static double calcAvg(int semester, int subject) {
      int sum = 0;
      for (int student = 0; student < STUDENTS; s++) {
         sum += scores[student][semster][subject];
      }
      return sum / (double) STUDENTS;
   }

   public static void printArr(int[] semesters, int[] subjects) {
      System.out.println("Subject   Semester   Average");

      // Case 1: One semester, multiple subjects
      if (semesters.length == 1 && subjects.length > 1) {
         int sem = semesters[0];
         for (int sub : subjects) {
            double avg = computeAverage(sem, sub);
            System.out.printf("%c         %s       %.2f%n",
                  (char)('A' + sub), semName(sem + 1), avg);
         }
      }

      // Case 2: Multiple semesters, one subject
      else if (semesters.length > 1 && subjects.length == 1) {
         int sub = subjects[0];
         for (int sem : semesters) {
            double avg = computeAverage(sem, sub);
            System.out.printf("%c         %s       %.2f%n",
                  (char)('A' + sub), semName(sem + 1), avg);
         }
      }

      System.out.println("-------------------------------------");
   }

   // Program execution starts here
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      genData();

      while (true) {
         // Get user input for semsters
         String[] semParts = getSemesters("Which semester? Fall(1), Spring(2), Summer(3)? (0 to quit): ", input);
         if (!getSemesters(input)) break;
         int[] semesters = new int[semParts.length];
         for (int i = 0; i < semParts.length; i++) {
            semesters[i] = Integer.parseInt(semParts[i]) - 1;
         }

         // Get user input for subjects
         String[] subParts = getSubjects("Which subject(s)? (A B C): ", input);
         if (!getSubjects(input)) break;
         int[] subjects = new int[subParts.length];
         for (int i = 0; i < subParts.length; i++) {
            subjects[i] = subIndex(subParts[i].charAt(0));
         }

         // Print results
         printArr(semsters, subjects);
      }
   }
}
