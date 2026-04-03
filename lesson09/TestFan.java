/* 
  Imani Hollie 04/02/2026
  Lab 10 Assignment: The Fan Class
  Design a class named Fan to represent a fan.
  
  The class contains:
  - Three constants names SLOW, MEDIUM, FAST with the values 1, 2, and 3
  - A private int data field named speed that specifies the speed of the fan (the default is SLOW)
  - A private boolean data field named on that specifies whether the fan is on or (the default is false)
  - A private double data filed named radius that specifies the radius of the fan (the default is 5)
  - A string data field named color that specifies the color of the fan (the default is blue)
  - the accessor and mutator methods for all 4 data fields
  - A no-argument constructor that creates a default fan
  - A method named toString() that returns a string description for the fan:
    - If the fan is on, the method returns the fan speed, color, and radius in one combined string
    - If the fan is off, the method returns the fan color and radius along with the string "fan is off" in one combinded string

  Draw the UML diagram for the class then implement the class.
  
  Write a test program that creates two Fan objects:
  - Assign maximum speed, radius 10, color yellow, and turn on the first object
  - Assign medium speed, radius 5, color blue, and turn off the second object
  Display the objects by invoking their toString() method
 */

public class TestFan {
  public static void main(String[] args) {
    // First fan object
    Fan fan1 = new Fan();
    fan1.setSpeed(Fan.FAST);
    fan1.setRadius(10);
    fan1.setColor("yellow");
    fan1.setOn(true);
    
    // Second fan object
    Fan fan2 = new Fan();
    fan2.setSpeed(Fan.MEDIUM);
    fan2.setRadius(5);
    fan2.setColor("blue");
    fan2.setOn(false);
    
    // Display results
    System.out.println(fan1.toString());
    System.out.println(fan2.toString());
  }
}

class Fan {
  // Declare constants and variables
  public static final int SLOW = 1;
  public static final int MEDIUM = 2;
  public static final int FAST = 3;
  private int speed;
  private boolean state;
  private double radius;
  private String color;

  // No-argument constructor
  public Fan() {
    speed = SLOW;
    state = false;
    radius = 5.0;
    color = "blue";
  }

  // Methods (Accessors and Mutators)
  public int getSpeed() { return speed; }
  public int setSpeed(int speed) { this.speed = speed; }
  
  public int getState() { return state; }
  public int setState(int speed) { this.state = state; }
  
  public int getRadius() { return radius; }
  public int setRadius(int speed) { this.radius = radius; }
  
  public int getColor() { return color; }
  public int setColor(int speed) { this.color = color; }

  public String toString() {
    if (state) {
      return "Fan Speed: " + speed +
             ", Color: " + color +
             ", Radius: " + radius;
    } else {
      return "Fan Color: " + color +
             ", Radius: " + radius; +
             ", fan is off";
    }
  }
}
