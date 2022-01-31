package gun51;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime1 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime=ZonedDateTime.now(ZoneId.of("US/Pacific"));

        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1=LocalTime.now(ZoneId.of("US/Pacific"));
        System.out.println(localTime1);
    }
}
