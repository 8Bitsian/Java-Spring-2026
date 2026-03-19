/* Imani Hollie 03/19/2026
   Lesson 8 Assignment:
   - Store exam scores for 5 students, 3 semesters, 3 subjects using a 3D array
   - Allow user to choose:
       * One semester with multiple subjects
       * Multiple semesters with one subject
   - Print the averages for each selected combination
*/

import java.util.Scanner;

public class J108_2 {

   private static final int STUDENTS = 5;
   private static final int SEMESTERS = 3; // Fall=1, Spring=2, Summer=3
   private static final int SUBJECTS = 3;  // A=0, B=1, C=2

   private static int[][][] scores = new int[STUDENTS][SEMESTERS][SUBJECTS];
   private static Scanner input = new Scanner(System.in);

   // -----------------------------
   // Generate the dataset
   // -----------------------------
   public static void genData() {
      int value = 1;
      for (int s = 0; s < STUDENTS; s++) {
         for (int sem = 0; sem < SEMESTERS; sem++) {
            for (int sub = 0; sub < SUBJECTS; sub++) {
               scores[s][sem][sub] = value;
               value++;
            }
         }
      }
   }

   // -----------------------------
   // Get user input for semesters and subjects
   // -----------------------------
   public static String[] getInput(String prompt) {
      System.out.print(prompt);
      String line = input.nextLine().trim();
      return line.split(" ");
   }

   // -----------------------------
   // Print the results table
   // -----------------------------
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

   // -----------------------------
   // Compute average for one semester + one subject
   // -----------------------------
   public static double computeAverage(int semester, int subject) {
      int sum = 0;
      for (int s = 0; s < STUDENTS; s++) {
         sum += scores[s][semester][subject];
      }
      return sum / (double) STUDENTS;
   }

   // -----------------------------
   // Convert semester number to name
   // -----------------------------
   public static String semName(int sem) {
      if (sem == 1) return "Fall";
      if (sem == 2) return "Spring";
      return "Summer";
   }

   // -----------------------------
   // Convert subject letter to index
   // -----------------------------
   public static int subIndex(char c) {
      if (c == 'A' || c == 'a') return 0;
      if (c == 'B' || c == 'b') return 1;
      return 2; // C
   }

   // -----------------------------
   // Main Program
   // -----------------------------
   public static void main(String[] args) {

      genData();

      while (true) {

         // Get semesters
         String[] semParts = getInput("Which semester? Fall(1), Spring(2), Summer(3)? (0 to quit): ");

         if (semParts[0].equals("0")) {
            System.out.println("Thank you.");
            break;
         }

         int[] semesters = new int[semParts.length];
         for (int i = 0; i < semParts.length; i++) {
            semesters[i] = Integer.parseInt(semParts[i]) - 1;
         }

         // Get subjects
         String[] subParts = getInput("Which subject(s)? (A B C): ");
         int[] subjects = new int[subParts.length];
         for (int i = 0; i < subParts.length; i++) {
            subjects[i] = subIndex(subParts[i].charAt(0));
         }

         // Print results
         printArr(semesters, subjects);
      }
   }
}


/* Imani Hollie 03/19/2026
   Lesson 8 Assignment:
   - Store exam scores for 5 students, 3 semesters, 3 subjects using a 3D array
   - Allow user to choose:
       * One semester with multiple subjects
       * Multiple semesters with one subject
   - Print the averages for each selected combination
*/

import java.util.Scanner;

public class J108_2 {

   private static final int STUDENTS = 5;
   private static final int SEMESTERS = 3; // Fall=1, Spring=2, Summer=3
   private static final int SUBJECTS = 3;  // A=0, B=1, C=2

   private static int[][][] scores = new int[STUDENTS][SEMESTERS][SUBJECTS];
   private static Scanner input = new Scanner(System.in);

   // -----------------------------
   // Generate the dataset
   // -----------------------------
   public static void genData() {
      int value = 1;
      for (int s = 0; s < STUDENTS; s++) {
         for (int sem = 0; sem < SEMESTERS; sem++) {
            for (int sub = 0; sub < SUBJECTS; sub++) {
               scores[s][sem][sub] = value;
               value++;
            }
         }
      }
   }

   // -----------------------------
   // Get user input for semesters and subjects
   // -----------------------------
   public static String[] getInput(String prompt) {
      System.out.print(prompt);
      String line = input.nextLine().trim();
      return line.split(" ");
   }

   // -----------------------------
   // Print the results table
   // -----------------------------
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

   // -----------------------------
   // Compute average for one semester + one subject
   // -----------------------------
   public static double computeAverage(int semester, int subject) {
      int sum = 0;
      for (int s = 0; s < STUDENTS; s++) {
         sum += scores[s][semester][subject];
      }
      return sum / (double) STUDENTS;
   }

   // -----------------------------
   // Convert semester number to name
   // -----------------------------
   public static String semName(int sem) {
      if (sem == 1) return "Fall";
      if (sem == 2) return "Spring";
      return "Summer";
   }

   // -----------------------------
   // Convert subject letter to index
   // -----------------------------
   public static int subIndex(char c) {
      if (c == 'A' || c == 'a') return 0;
      if (c == 'B' || c == 'b') return 1;
      return 2; // C
   }

   // -----------------------------
   // Main Program
   // -----------------------------
   public static void main(String[] args) {

      genData();

      while (true) {

         // Get semesters
         String[] semParts = getInput("Which semester? Fall(1), Spring(2), Summer(3)? (0 to quit): ");

         if (semParts[0].equals("0")) {
            System.out.println("Thank you.");
            break;
         }

         int[] semesters = new int[semParts.length];
         for (int i = 0; i < semParts.length; i++) {
            semesters[i] = Integer.parseInt(semParts[i]) - 1;
         }

         // Get subjects
         String[] subParts = getInput("Which subject(s)? (A B C): ");
         int[] subjects = new int[subParts.length];
         for (int i = 0; i < subParts.length; i++) {
            subjects[i] = subIndex(subParts[i].charAt(0));
         }

         // Print results
         printArr(semesters, subjects);
      }
   }
}


/* Imani Hollie 03/19/2026
   Lesson 8 Assignment
   - Store exam scores for 5 students, 3 semesters, 3 subjects
   - Let the user choose semesters and subjects
   - Print the averages
*/

import java.util.Scanner;

public class J108_2 {

   // 5 students, 3 semesters, 3 subjects
   static int[][][] scores = new int[5][3][3];

   // -----------------------------
   // Fill the array with numbers 1–45
   // -----------------------------
   public static void genArr() {
      int value = 1;

      for (int student = 0; student < 5; student++) {
         for (int sem = 0; sem < 3; sem++) {
            for (int sub = 0; sub < 3; sub++) {
               scores[student][sem][sub] = value;
               value++;
            }
         }
      }
   }

   // -----------------------------
   // Ask user for semesters
   // -----------------------------
   public static String[] getSemesters(Scanner input) {
      System.out.print("Which semester? Fall(1), Spring(2), Summer(3)? (0 to quit): ");
      String line = input.nextLine();
      return line.split(" ");
   }

   // -----------------------------
   // Ask user for subjects
   // -----------------------------
   public static String[] getSubjects(Scanner input) {
      System.out.print("Which subject(s)? A B C: ");
      String line = input.nextLine();
      return line.split(" ");
   }

   // -----------------------------
   // Convert semester number to name
   // -----------------------------
   public static String semName(int sem) {
      if (sem == 1) return "Fall";
      if (sem == 2) return "Spring";
      return "Summer";
   }

   // -----------------------------
   // Convert subject letter to index
   // -----------------------------
   public static int subIndex(char c) {
      if (c == 'A' || c == 'a') return 0;
      if (c == 'B' || c == 'b') return 1;
      return 2; // C
   }

   // -----------------------------
   // Calculate average for one semester + one subject
   // -----------------------------
   public static double calcAvg(int sem, int sub) {
      int sum = 0;

      for (int student = 0; student < 5; student++) {
         sum += scores[student][sem][sub];
      }

      return sum / 5.0;
   }

   // -----------------------------
   // Print averages
   // -----------------------------
   public static void printArr(int[] semesters, int[] subjects) {

      System.out.println("Subject   Semester   Average");

      // One semester, many subjects
      if (semesters.length == 1 && subjects.length > 1) {
         int sem = semesters[0];

         for (int sub : subjects) {
            double avg = calcAvg(sem, sub);
            System.out.printf("%c         %s       %.2f%n",
                  (char)('A' + sub), semName(sem + 1), avg);
         }
      }

      // Many semesters, one subject
      else if (semesters.length > 1 && subjects.length == 1) {
         int sub = subjects[0];

         for (int sem : semesters) {
            double avg = calcAvg(sem, sub);
            System.out.printf("%c         %s       %.2f%n",
                  (char)('A' + sub), semName(sem + 1), avg);
         }
      }

      System.out.println("----------------------------------");
   }

   // -----------------------------
   // MAIN PROGRAM
   // -----------------------------
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      genArr(); // fill the 3D array

      while (true) {

         // Get semesters
         String[] semParts = getSemesters(input);

         if (semParts[0].equals("0")) {
            System.out.println("Thank you.");
            break;
         }

         int[] semesters = new int[semParts.length];
         for (int i = 0; i < semParts.length; i++) {
            semesters[i] = Integer.parseInt(semParts[i]) - 1;
         }

         // Get subjects
         String[] subParts = getSubjects(input);
         int[] subjects = new int[subParts.length];
         for (int i = 0; i < subParts.length; i++) {
            subjects[i] = subIndex(subParts[i].charAt(0));
         }

         // Print averages
         printArr(semesters, subjects);
      }
   }
}
