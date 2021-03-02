package Day11.Examples;

import java.util.Scanner;
public class ExceptionHandlingDemo {
	public static void main(String[] args) throws Exception{
		Dog tiger=new Dog();
		Child baby=new Child();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the item class...:");
		String itemClass=scan.next();
		Item item=(Item)Class.forName(itemClass).getConstructor().newInstance();
		
		baby.playWithDog(tiger,item);
	}
}
abstract class Item{
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public abstract void execute()throws DogExceptions;
}
abstract class DogExceptions extends Exception{
	public abstract void visit();
}
class DogBiteException extends DogExceptions{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception..:"+this.msg;
	}
	@Override
	public void visit() {
		new Handler911India().handle(this);
	}
}
class DogBarkException extends DogExceptions{
	String msg;
	public DogBarkException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception..:"+this.msg;
	}
	@Override
	public void visit() {
		new Handler911India().handle(this);		
	}
}
class DogHappyException extends DogExceptions{
	String msg;
	public DogHappyException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception..:"+this.msg;
	}
	@Override
	public void visit() {
		new Handler911India().handle(this);		
	}
}
class StickItem extends Item{
	public StickItem() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void execute() throws DogExceptions{
		throw new DogBiteException("You beat I bite...............");
	}
}
class StoneItem extends Item{
	public StoneItem() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void execute()throws DogExceptions {
		throw new DogBarkException("You throw I run...................");
	}
}
class BiscuitItem extends Item{
	public BiscuitItem() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void execute()throws DogExceptions {
		throw new DogBarkException("You throw I ear,...yummy yummy...................");
	}
}
class Dog{
	public void play(Item item)throws DogExceptions {
		item.execute();
	}
}
class Child{
	public void playWithDog(Dog dog,Item item) {
		try {
			dog.play(item);
//		}catch(DogBiteException e) {
//			new Handler911India().handle(e);
//			System.out.println(e);
//		}catch(DogBarkException dbe) {
//			new Handler911India().handle(dbe);
//			System.out.println(dbe);
		}catch(DogExceptions dee) {
			System.out.println("dog exceptions..................."+dee);
			dee.visit();
		}
	}
}
abstract class Handler911 {
	public abstract void handle(DogBiteException de);
	public abstract void handle(DogBarkException dbe);
	public abstract void handle(DogHappyException dhe);
}
class Handler911India extends Handler911{
	@Override
	public void handle(DogBarkException dbe) {
		System.out.println("Dont worry......it wont bite...barking dogs seldom bite............");
	}
	@Override
	public void handle(DogBiteException de) {
		System.out.println("dog has bitten,,,,,take him to hospital or we are sending a ambulance...");
	}
	@Override
	public void handle(DogHappyException dhe) {
		System.out.println("Yummy.......dont worry...play with the dog......its happy.........");
	}
}
