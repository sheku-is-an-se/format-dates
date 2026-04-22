package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDate {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today is: " + today);
        //define patterns here
        DateTimeFormatter slashFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter isoFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dayDateFormat = DateTimeFormatter.ofPattern("EEEE dd, yyyy");
        DateTimeFormatter longDateTimeFormat = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");
        DateTimeFormatter challengeFormat = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");





        //format dates
        String formattedDate1 = today.format(slashFormat);
        String formattedDate2 = today.format(isoFormat);
        String formattedDate3 = today.format(dayDateFormat);
        String formattedDate4 = today.format(longDateTimeFormat);

        //print formatted dates
        System.out.println(formattedDate1);
        System.out.println(formattedDate2);
        System.out.println(formattedDate3);
        System.out.println(formattedDate4);

    }
}
