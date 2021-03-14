package Revision;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class SingletonPrototypeIdealClassDemo {
	public static void main(String[] args) {
//		ExecutorService es=Executors.newFixedThreadPool(2);
//		es.execute(()->{MySingle.createClone();});
//		es.execute(()->{MySingle.createClone();});
//		
//		es.shutdown();
		
		MySingle mys1=MySingle.createClone();
		mys1.setS("hello world");
		MySingle mys2=MySingle.createClone();
		mys2.setS("hello moon");
		
		System.out.println("First clone..:"+mys1.getS());
		System.out.println("Second clone..:"+mys2.getS());
	}
}
class MySingle implements Cloneable{
	private String s;
	public final String getS() {
		return s;
	}
	public final void setS(String s) {
		this.s = s;
	}
	private MySingle() {
		System.out.println("my single object created...");
	}
	private static MySingle mySingle;
	synchronized public static MySingle createObject() {
		if(mySingle==null) {
			mySingle=new MySingle();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
		return mySingle;
	}
	
	synchronized public static MySingle createClone() {
		try {
			if(mySingle==null) {
				mySingle=new MySingle();
				MySingle cloneSingle=mySingle.getClone();
				return cloneSingle;
			}
			else {
				return mySingle.getClone();
			}
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	synchronized private MySingle getClone()throws Exception {
		return (MySingle)super.clone();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MySingle other = (MySingle) obj;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MySingle [s=" + s + "]";
	}
	
	
}
/*
 * 1. Singleton
 * 2. Multiton
 * 3. prototype
 * 4. Deep copy
 */