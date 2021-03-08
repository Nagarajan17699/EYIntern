package Day14_Lab;
import java.util.Observable;
import java.util.Observer;
public class MultiThreadedObservableDemo {
	public static void main(String[] args) {
		FireAlarm shakthi=new FireAlarm();
		Student ey=new Student();
		Teacher shoiab=new Teacher();
		shakthi.addObserver(ey);
		shakthi.addObserver(shoiab);
		
		shakthi.setAlarm();
	}
}
class MultiThreadedObservable extends Observable{
	@Override
	public synchronized void addObserver(Observer o) {
		// TODO Auto-generated method stub
		super.addObserver(o);
	}
	@Override
	public void notifyObservers(Object arg) {
		// TODO Auto-generated method stub
		super.notifyObservers(arg);
	}
	
}
class FireAlarm extends MultiThreadedObservable{
	public void setAlarm() {
		setChanged();
		notifyObservers("fire in the mountain run run run..................");
	}
}
class Student implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		odungo((String)arg);
	}
	public void odungo(String msg) {
		System.out.println("student running............"+msg);
	}
}
class Teacher implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		odungo((String)arg);
	}
	public void odungo(String msg) {
		System.out.println("odlama vendama...................");
		System.out.println("teacher is thinking...................................");
		try {Thread.sleep(10000);}catch(Exception e) {}
		System.out.println("teching running.............."+msg);
	}
}