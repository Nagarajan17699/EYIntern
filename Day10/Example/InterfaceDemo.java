package Day10.Example;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Scanner;
public class InterfaceDemo {
	public static void main(String[] args) {
		/*
		 * Interface is a special class whose activity is promised by the class which implements it, and when an behavioral object is subjected
		 * to the implementation, the bahavioral object becomes a component.
		 *
		 * Doctor is a spcial class whose activity is implemented in medical college, when shoiab is subjected to medical college, shoiab becomes a
		 * part of(Component) medical fraternity as doctor, and people REALIZE the objective of getting cured by going to shoiab, who in turn is
		 * now playing the role of doctor.
		 *
		 */
		
		Object shoiab=new Human();//1974
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please god make me a doctor.....");
		scanner.next();
		
		//today in 2021 i decided to become a doctor...
		
		StanleyAlopathyMC stanley=new StanleyAlopathyMC();
		JetAcademy jet=new JetAcademy();
		shoiab=Proxy.newProxyInstance
				(Human.class.getClassLoader(), new Class[] {Pilot.class}, new MyInvocationHandler(jet));//subjection - THIS IS HAPPENING AT RUNTIME
		
		
		//Doctor doctorShoiab=(Doctor)shoiab;//THIS IS HAPPENING AT RUNTIME..
		//doctorShoiab.doCure();
		
		Pilot pilotShoiab=(Pilot)shoiab;
		pilotShoiab.doFly();
	}
	
}
class Human{//behavioral class
	
}
class MyInvocationHandler implements InvocationHandler
{
	Object obj;
	public MyInvocationHandler(Object obj) {
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invoke method called.....");
		Object o=method.invoke(obj, args);
		return o;
	}
}
interface Doctor{
	public void doCure();
}
class StanleyAlopathyMC implements Doctor{//implementation class
	@Override
	public void doCure() {
		System.out.println("do cure as per alopathy.....");
	}
}
interface Pilot{
	public void doFly();
}
class JetAcademy implements Pilot{
	@Override
	public void doFly() {
		System.out.println("pilot pilot pilot...................");
	}
}