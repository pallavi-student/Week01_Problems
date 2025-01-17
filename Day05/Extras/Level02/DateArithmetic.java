package Day05.Extras.Level02;

import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 1, 1); // Example date

        // Add days, months, and years
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract weeks
        result = result.minusWeeks(3);

        System.out.println("Final Date: " + result);
    }
}
