package Day9.Example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class ReflectionExample2 {
	public static void main(String[] args)throws Exception {
		PoliceStation p1=(PoliceStation)Class.forName("day9revision.PoliceStation").
				getConstructor(new Class[] {String.class}).newInstance("blablabla");
		Politician politician=(Politician)Class.forName("day9revision.Politician").getConstructor().newInstance();
		
		p1.arrest(politician);
		
		BogusDoctor doctor=new BogusDoctor();
		//p1.arrest(doctor);
	}
}
class PoliceStation{
	public PoliceStation() {
		// TODO Auto-generated constructor stub
	}
	public PoliceStation(String s) {
		System.out.println("overloaded string cons of policstation called...."+s);
	}
	public void arrest(Object accused)throws Exception {
//		if(accused instanceof Politician) {
//			Politician p=(Politician)accused;
//		}
//		else if(accused instanceof BogusDoctor) {
//			
//		}
		//inrospection
		Class c=accused.getClass();
		Field f[]=c.getFields();
		for(Field ff:f) {
			System.out.println(ff.getName());
		}
		Field field=c.getField("name");
		System.out.println(field.get(accused));
		
		Method method=c.getMethod("service", new Class[] {int.class});
		String value=(String)method.invoke(accused, new Object[] {Integer.valueOf(100)});
		System.out.println("The return...:"+value);
		
		
		field=c.getDeclaredField("secretName");
		field.setAccessible(true);
		System.out.println(field.get(accused));
		
		method=c.getDeclaredMethod("secretService", new Class[] {int.class});
		method.setAccessible(true);
		value=(String)method.invoke(accused, new Object[] {Integer.valueOf(100)});
		System.out.println("The return...:"+value);
	}
	
	
}
class Politician {
	public Politician() {
		// TODO Auto-generated constructor stub
	}
	public String name="good man";
	private String secretName="bad man...";
	public String service(int money) {
		return "Since u gave money.....I am your friend...";
	}
	private String secretService(int money) {
		return "Since I am a bad man.....I will cheat you...and take all your money...";
	}
}
class BogusDoctor{
	
}