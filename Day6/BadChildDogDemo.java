package day6;
import java.util.Scanner;
import static sun.net.util.IPAddressUtil.scan;
public class BadChildDogDemo {
	public static void main(String[] args)throws Exception {
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter a item...:");
		String item=s.nextLine();
                Container c = new Container();
                BullDog b = c.getAction("day6."+item);
                System.out.println("Here");
                b.action();
		
	}
}

class Container
{
    public BullDog getAction(String str) throws Exception
    {
        
        BullDog bd =  (BullDog) Class.forName(str).newInstance();
        System.out.println("Here");
        System.out.println(Class.forName(str).toString());
        return bd;
    
    }
}

abstract class BullDog{
public void action(){}
}

class Stick extends BullDog{
    public void action()
    {
        System.out.println("You beat i bite");
    }
}
class Stone extends BullDog{
    public void action()
    {
        System.out.println("You throw i bark");
    }
}