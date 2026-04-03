import java.time.LocalDate;

public class IStudentTest {
    public static void main(String[] args) {
        IStudent student1 = new IStudent();
        System.out.println("Initial values:");
        System.out.println(student1);

        IStudent student2 = new IStudent(100, "Sammy", LocalDate.now());
        System.out.println("\nNew values:");
        System.out.println(student2);
    }
}

class IStudent {
    // Data fields w/primitive data types
    private int id;
    private String name;
    private LocalDate dateCreate;

    // Constructors (No return type)
    public IStudent() {
    }
    public IStudent(int id, String name, LocalDate dateCreate) {
        this.id = id;
        this.name = name;
        this.dateCreate = dateCreate;
    }

    // Methods (Getters and Setter)
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Date Created: " + dateCreate;
    }
}
