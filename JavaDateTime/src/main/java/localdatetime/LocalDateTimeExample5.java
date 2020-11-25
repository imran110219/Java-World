package localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Sadman
 */
public class LocalDateTimeExample5 {
    public static void main(String[] args) {
        LocalDateTime datetime1 = LocalDateTime.of(2017, 1, 14, 10, 34);
        LocalDateTime datetime2 = datetime1.plusDays(120);
        System.out.println("Before Formatting: " + datetime2);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formatDateTime = datetime2.format(format);
        System.out.println("After Formatting: " + formatDateTime );
    }
}
