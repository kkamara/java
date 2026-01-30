import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        // LocalDate, LocalTime, LocalDateTime, UTC timestamp.

        // LocalDate date = LocalDate.now();
        // LocalTime time = LocalTime.now();
        // LocalDateTime dateTime = LocalDateTime.now();
        // Instant instant = Instant.now();

        // System.out.println(date);
        // System.out.println(time);
        // System.out.println(dateTime);
        // System.out.println("UTC timestamp: " + instant);

        // LocalDateTime dateTime = LocalDateTime.now();
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
        //     "yyyy-MM-dd HH:mm:ss"
        // );
        // System.out.println(dateTime.format(formatter));

        // LocalDate date = LocalDate.of(
        //     2026, 1, 30
        // );
        // System.out.println(date);

        // LocalDateTime date = LocalDateTime.of(
        //     2026, 1, 30, 19, 47, 0  
        // );
        // System.out.println(date);

        LocalDateTime date1 = LocalDateTime.of(
            2026, 1, 1, 12, 0, 0  
        );
        LocalDateTime date2 = LocalDateTime.of(
            2026, 1, 1, 12, 0, 0  
        );
        
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is earlier than " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is later than " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is equal to " + date2);
        }
    }
}
