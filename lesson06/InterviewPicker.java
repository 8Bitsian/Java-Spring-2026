import java.util.*; // Includes multiple classes in one library

/* Classes used w/in this code
  import java.util.Arrays;
  import java.util.Collections;
  import java.util.Lists;
*/

// 2. import java.util.stream.IntStream;

public class InterviewPicker {
  public static void main(String[] args) {
    // Create a string array of interviewees
    String[] interviewees {
      "John Owen"
      "Jane Doe"
      "Sally Lang"
      "Clair Harrell"
      "Grayson Burch"
      "Kellen Martinez"
    }
    
    // Create an arrayList dericed from the array
    List<String> studentList = Arrays.asList(interviewees); // Shortcut list using an array class
    
    // Use the static method shuffle to randomize the list
    Collections.shuffle(studentList); // Avoids repeated outputs

    // 1. Display randomized list using a traditional for loop
    for (int i = 0; i < interviewees.length; i++) {
      // int number = (int)(Math.random() * 6) + 1; // Causes repeated outputs
      // System.out.println((i+1) + ". " + interviewees[number]);
      System.out.println((i+1) + ". " + interviewees[i]); // List has been shuffled
    }

    // 2. Display the randomized array using a String object
    /*
      IntStream.range(0, interviewees.length) // An explicit integer stream with a set range
        .mapToObj(i -> ( i + 1) + ". " + interviewees[i]) // Map to an array
          .forEach(System.out.println);  // Each element will be printed out to console
    */

    // 3. Arrays.stream(interviewees.forEach(System.out::println);
  }
}
