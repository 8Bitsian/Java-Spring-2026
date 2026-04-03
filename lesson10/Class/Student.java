public class Student {
    String name;
    int gradeLevel;

    public Student() {}

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student name: " + student.name);    // Nothing is set so default is null
        System.out.println("Student level: " + student.gradeLevel);   // Nothing is set so default is 0
    }
}
