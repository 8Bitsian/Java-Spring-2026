import java.time.LocalDate;
import java.util.Date;

public class JavaDateObjects {
    public static void main(String[] args) {
        // Legacy Date object creation (outdated)
        Date now = new Date();
        // now.
        System.out.println(now); // Includes date + time

        LocalDate today = LocalDate.now();
        // today.
        System.out.println(today); // 2026-04-02
    }
}
