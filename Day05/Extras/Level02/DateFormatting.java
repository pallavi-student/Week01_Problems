package Day05.Extras.Level02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        // Format the date in different styles
        String format1 = currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String format2 = currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String format3 = currentDate.format(DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy"));

        System.out.println("Format 1: " + format1);
        System.out.println("Format 2: " + format2);
        System.out.println("Format 3: " + format3);
    }
}
