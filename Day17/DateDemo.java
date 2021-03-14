package Day17;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
public class DateDemo {
public static void main(String[] args) {
	NumberFormat numberFormatter=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
	
	int i=351684;
	
	System.out.println(String.format("%s",numberFormatter.format(i)));
	
	DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT,new Locale("en","IN"));
	
	
	Date date=new Date();
	
	System.out.println(df.format(date));
	
	//please do R&D on these patterns....
	DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd-MM-yyyy",new Locale("en","US"));
	String cd=LocalDate.now().format(dtf);
	
	System.out.println(cd);
	
	
}
}