/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author Nagarajan
 */
public class LocaleDateTime {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Current Time: " + ldt);

        LocalDate ld = ldt.toLocalDate();
        System.out.println("Local Date: " + ld);

        LocalTime lt = ldt.toLocalTime();
        System.out.println("LocalTIme: " + lt);

        Month month = ldt.getMonth();
        int yr = ldt.getYear();
        int day = ldt.getDayOfMonth();
        System.out.println(day + " " + month + " " + yr);

        int hr = ldt.getHour();
        hr %= 12;
        int min = ldt.getMinute();
        int sec = ldt.getSecond();

        System.out.println(hr + ":" + min + ":" + sec);

        LocalDate cd = LocalDate.of(2024, Month.JUNE, 17);
        System.out.print(cd.getDayOfYear() + " ");
        System.out.print(cd.getDayOfMonth() + " ");
        System.out.println(cd.getDayOfWeek());

        LocalTime clt = LocalTime.of(5, 48, 57, 45); // hh mmm ss nn (nn -> Nano Second)
        System.out.println(clt.getNano());

        LocalTime nextTime = clt.plusMinutes(5);
        System.out.println(clt);
        
        LocalTime lct = LocalTime.parse("05:25:36");
        
        System.out.println(lct.getHour());
    }
}
