package Revision;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
public class FactoryPatternStatic {
	public static void main(String[] args)throws Exception {
		ShoeSeller seller=StaticContainer.getSeller();
		Customer customer=new Customer();
		customer.setName("ramu");
		Shoe shoe=seller.sellShoe(customer);
		System.out.println(shoe);
	}
}
@Retention(RetentionPolicy.RUNTIME)
@interface In{
	String factoryName();
}
class StaticContainer{
	public static ShoeSeller getSeller() throws Exception{
		ShoeShop seller=new RamuShoeShop();
		Class c=seller.getClass().getSuperclass();
		Field f=c.getDeclaredField("smf");
		//System.out.println(f);
		f.setAccessible(true);
		In in=f.getAnnotation(In.class);
		//System.out.println(in);
		if(in!=null) {
			String factoryClass=in.factoryName();
			ShoeFactory factory=(ShoeFactory)Class.forName(factoryClass).getConstructor().newInstance();
			seller.setSmf(factory);
		}
		return seller;
	}
}
class Customer{
	private String name;
	public void setName(String name) {this.name=name;}
	public String getName() {return this.name;}
}
abstract class Shoe{
	
}
class LeatherShoe extends Shoe{}
class SportsShoe extends Shoe{}
interface Seller{
	
}
interface ShoeSeller extends Seller{
	public Shoe sellShoe(Customer customer);
}
interface Exporter{
	
}
interface ShoeExporter extends Exporter{
	public void exportShoe();
}
interface Manufacturer{
	
}
interface ShoeManufactuer extends Manufacturer{
	public Shoe makeShoe();
}
//class ShoeSellerImpl implements ShoeSeller{
//	@Override
//	public Shoe sellShoe(Customer customer,ShoeManufactuer smf) {
//		// TODO Auto-generated method stub
//		return smf.makeShoe();
//	}
//}
//class ShoeMfrImpl implements ShoeManufactuer{
//	@Override
//	public Shoe makeShoe() {
//		// TODO Auto-generated method stub
//		return new LeatherShoe();
//	}
//}
//class ShoeExporterImpl implements ShoeExporter{
//	@Override
//	public void exportShoe() {
//		System.out.println("shoe is exported........");
//	}
//}
abstract class ShoeShop implements ShoeSeller{
	@In(factoryName = "revision.LakhaniShoeFactory")
	private ShoeManufactuer smf;
	final public ShoeManufactuer getSmf() {
		return smf;
	}
	final public void setSmf(ShoeManufactuer smf) {
		this.smf = smf;
	}
}
class RamuShoeShop extends ShoeShop{
	@Override
	public Shoe sellShoe(Customer customer) {
		// TODO Auto-generated method stub
		return getSmf().makeShoe();
	}
}
abstract class ShoeFactory implements ShoeManufactuer{
	public ShoeFactory() {
		// TODO Auto-generated constructor stub
	}
}
class BataShoeFactory extends ShoeFactory{
	public BataShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe makeShoe() {
		// TODO Auto-generated method stub
		return new LeatherShoe();
	}
}
class LakhaniShoeFactory extends ShoeFactory{
	public LakhaniShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe makeShoe() {
		// TODO Auto-generated method stub
		return new SportsShoe();
	}
}