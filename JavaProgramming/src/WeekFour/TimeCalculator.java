package WeekFour;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
public class TimeCalculator {
    // Method to get current local time using LocalDateTime
    public void getCurrentLocalDateTime() {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Current LocalDateTime: " + ldt);
    }

    // Method to get current time using ZonedDateTime
    public void getCurrentZonedDateTime() {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("Current ZonedDateTime: " + zdt);
    }

    public static void main(String[] args) {
        TimeCalculator tc = new TimeCalculator();

        tc.getCurrentLocalDateTime();
        tc.getCurrentZonedDateTime();
    }
}
