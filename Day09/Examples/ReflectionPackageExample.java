package Day09.Examples;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class ReflectionPackageExample {
	public static void main(String[] args) throws Exception{
		PoliceStation p1=new PoliceStation();
		Politician politician=new Politician();
		
		p1.arrest(politician);
	}
}
class PoliceStation{
	public void arrest(Politician politician)throws Exception {
		System.out.println(politician.name);
		politician.service();
		
		//interrogation or introspection
		Class c=politician.getClass();
		Field f=c.getField("name");
		String nameValue=(String)f.get(politician);
		System.out.println("Name of the accused is...:"+nameValue);
		
		Method method=c.getMethod("service");
		System.out.println("Work of the accused is...");
		method.invoke(politician);
		
		//torture room - a different strategy to extract secret info..
		f=c.getDeclaredField("secretName");
		f.setAccessible(true);
		String secretNameValue=(String)f.get(politician);
		System.out.println("Sir...this fellows secret name...sir..:"+secretNameValue);
		
		method=c.getDeclaredMethod("secretService");
		method.setAccessible(true);
		System.out.println("sir ... this fellow secret work is...sir...:");
		method.invoke(politician);
		
		
	}
}
class Politician{
	public String name="Good Man";
	private String secretName="Bad Man";
	public void service() {
		System.out.println("social service.....");
	}
	private void secretService() {
		System.out.println("cheating......");
	}
}