package Day16;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
public class LocaleDateDemo {
	public static void main(String[] args) {
		LocalDateTime currentDateTime=LocalDateTime.now();
		
		System.out.println("Current Time...:"+currentDateTime);
		
		LocalDate currentDate=currentDateTime.toLocalDate();
		System.out.println("CurrentDate..:"+currentDate);
		
		LocalTime currentTime=currentDateTime.toLocalTime();
		System.out.println("CurrentTime..:"+currentTime);
		
		Month month=currentDateTime.getMonth();
		int year=currentDateTime.getYear();
		int day=currentDateTime.getDayOfMonth();
		
		int hr=currentDateTime.getHour();
		int mts=currentDateTime.getMinute();
		int scs=currentDateTime.getSecond();
		
		System.out.println(day+"/"+month.getValue()+"/"+year);
		
		System.out.println(hr+":"+mts+":"+scs);
		
		LocalDate customDate=LocalDate.of(2018, Month.JANUARY, 1);
		
		System.out.println(customDate.getDayOfMonth());
		
		LocalTime customTime=LocalTime.of(2,20, 15);
		System.out.println(customTime);
		
		LocalTime parseTime=LocalTime.parse("02:15:30");
		System.out.println(parseTime.getMinute());
		
		LocalDate nextCentury=customDate.plus(10,ChronoUnit.MONTHS);
		System.out.println(nextCentury);
		
		LocalTime nextTime=customTime.plus(1,ChronoUnit.HOURS);
		System.out.println(nextTime);
		
		ZonedDateTime internationalDateTime=ZonedDateTime.now();
		System.out.println(internationalDateTime);
		
		ZonedDateTime ktime=ZonedDateTime.parse("2021-03-09T13:55:36.591593100+05:30[Asia/Karachi]");
		System.out.println(ktime);
		
	}
}