package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class time_1 {
    public static void main(String[] args)
    {
        LocalDateTime dt = LocalDateTime.now(); //this is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");  //this is format

        String myDate = dt.format(df);  //creating date string using date and format
        System.out.println(myDate);
    }
}
