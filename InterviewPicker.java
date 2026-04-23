import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class InterviewPicker {
    public static void main(String[] args) {
        // Create a string array of interviewees
        String[] interviewees = {
                "Asher Cartegena",
                "Mason Fiorini",
                "Lauren Gradford",
                "Imani Hollie",
                "Stefan Howell",
                "Elikia Kilandi",
                "Wilsarte Merat"
        };

        // Create an arraylist derived from the array
        List<String> studentList = Arrays.asList(interviewees);

        // Use the static method shuffle to randomize the list
        Collections.shuffle(studentList);

        // display the randomized list using a traditional for loop

        for(int i=0; i < interviewees.length ; i++){
            System.out.println((i+1) + ". " + interviewees[i]);
        }



        // Display the randomized array using a Stream object
        /*
            IntStream.range(0, interviewees.length)
                        .mapToObj(i -> (i+1) + ". " + interviewees[i])
                                .forEach(System.out::println);

         */



        //Arrays.stream(interviewees).forEach(System.out::println);
    }
}
