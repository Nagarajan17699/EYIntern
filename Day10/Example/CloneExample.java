package Day10.Example;
public class CloneExample {
	public static void main(String[] args) throws Exception {
		Daal daal=Daal.createObject();
		ChickenCurry cc=ChickenCurry.createObject();
		Daal daal2=daal.createClone();
		
		Food food = daal.createClone( cc.createClone(daal2));
		System.out.println(food.getCost());
	}
}
abstract class Food{
	public  abstract  int getCost();
}
abstract class VegFood extends Food{
	
}
abstract class NonVegFood extends Food{
	
}
class Daal extends VegFood implements Cloneable{
	
	private Food food;
	private static Daal daal;
	
	private Daal() {
		System.out.println("Daal Object has been created ...  ");
	}
	private Daal(Food food) {
		this.food=food;
	}
	public static Daal createObject() {
		if(daal == null) {
			daal = new Daal();
		}
		return daal;
	}
	
	public static Daal createObject(Food $food) {
		if(daal == null) daal = new Daal($food);
		return daal;
	}
	
	public Daal createClone() throws Exception{
		return (Daal) super.clone();
	}
	public Daal createClone(Food food) throws Exception{
		this.food=food;
		return (Daal) super.clone();
	}
	@Override
	public int getCost() {
		if(food == null) return 5;
		return 5 + food.getCost();
	}
}class ChickenCurry extends NonVegFood implements Cloneable{
	
	private Food food;
	private static ChickenCurry cc;
	
	private ChickenCurry() {
		System.out.println("chicken curry object has been created... ");
	}
	private ChickenCurry(Food food) {
		this.food=food;
		System.out.println("chicken curry object has been created... ");
	}
	
	public static ChickenCurry createObject() {
		if(cc == null) cc = new ChickenCurry();
		return cc;
	}
	
	public static ChickenCurry createObject(Food $food) {
		if(cc == null) cc = new ChickenCurry($food);
		return cc;
	}
	
	@Override
	public int getCost() {
		if(food == null) return 30;
		return 30 + food.getCost();
	}
	
	
	public ChickenCurry createClone(Food food) throws Exception {
		this.food=food;
		return (ChickenCurry) super.clone();
	}
	public ChickenCurry createClone() throws Exception {
		return (ChickenCurry) super.clone();
	}
}