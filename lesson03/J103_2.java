/* Imani Hollie 01/15/2026
   Lesson 3 Assignment: Update the code to take input kg/cm and output in pound/feet/inch.
   - Apply your coding sytle
   - Add comments to explain the code
   - Test the updated code using your own test data

   Sample Code:
   System.out.print("Enter weight in pounds: ");
   double weight = input.nextDouble();  // weight = 50
   System.out.print("Enter height in inches: ");
   double height = input.nextDouble();  // height = 100
   final double KILOGRAMS_PER_POUND = 0.4535;
   final double METERS_PER_INCH = 0.0254;
   double bmi = weightInKilograms / (heightInMeters * heightInMeters);
   System.out.prinln("BMI is " + bmi);
   if (bmi < 18.5)
     System.out.println("Underweight");
   else if (bmi < 25)
     System.out.println("Normal");
   else if (bmi < 30)
     System.out.println("Overweight");
   else
     System.out.println("Obese");
   // Your output:
     
   Sample Ouput:
   Weight (lb): ***
   Height (ft): ***
   Height (in): ***
   ==========================
   Your BMI is *** which is ***
*/

// Part 1 of Lab Project
public class J103_2 {
  public static void main(String[] args) {
    // Define Constants
    final double KILOGRAMS_PER_POUND = 0.4535;
    final double METERS_PER_INCH = 0.0254;
     
    // Get user input for weight and height
    System.out.print("Enter weight in pounds: ");
    double weight = input.nextDouble();            // weight = 50
    System.out.print("Enter height in inches: ");
    double height = input.nextDouble();            // height = 100
    
    // Calculate Conversions
    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
    double heightInMeters = height * METERS_PER_INCH;

    // Calculate BMI
    double bmi = weightInKilograms / (heightInMeters * heightInMeters);
    System.out.println("BMI is " + bmi);

    // Output BMI range
    if (bmi < 18.5)
      System.out.println("Underweight");
    else if (bmi < 25)
      System.out.println("Normal");
    else if (bmi < 30)
      System.out.println("Overweight");
    else
      System.out.println("Obese");
  }
}
