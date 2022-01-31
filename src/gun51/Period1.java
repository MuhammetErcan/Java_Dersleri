package gun51;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Period1 {
    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
        LocalDate date1=LocalDate.of(1990,05,28);

        Period period=Period.between(date1,date);
        System.out.println(period);

        String str1="10.23";
        String str2="10:23";








    }
}
