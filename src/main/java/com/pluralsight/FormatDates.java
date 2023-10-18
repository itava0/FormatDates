package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime currentDate  = LocalDateTime.now();

        DateTimeFormatter date1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
        DateTimeFormatter date2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter date3 = DateTimeFormatter.ofPattern("MMMM dd yyyy");
        DateTimeFormatter date4 = DateTimeFormatter.ofPattern("E, MMMM dd yyyy HH:mm");

        DateTimeFormatter date5 = DateTimeFormatter.ofPattern("HH:mm yyyy-MM-dd");

        String formattedDate1 = currentDate.format(date1);
        String formattedDate2 = currentDate.format(date2);
        String formattedDate3 = currentDate.format(date3);
        String formattedDate4 = currentDate.format(date4);
        String formattedDate5 = currentDate.format(date5);

        System.out.println(formattedDate1);
        System.out.println(formattedDate2);
        System.out.println(formattedDate3);
        System.out.println(formattedDate4);
        System.out.println(formattedDate5);
    }
}
