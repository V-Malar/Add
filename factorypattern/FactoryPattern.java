package factorypattern;

public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ShoeShop seller=new RamuShoeShop();
		
		ShoeFactory bsf=new LakhaniShoeFactory();
		
		//dependency injection
		
		seller.setFactory(bsf);
		
		Customer customer=new Customer();
		customer.name="ramu";
		Shoe shoe=seller.sell(customer);
		System.out.println(shoe);
	}

}
abstract class Shoe{
	
}
class SportsShoe extends Shoe{}
class LeatherShoe extends Shoe{}
interface Manufacturer{
	public Shoe make();
}
interface ShoeManufacturer extends Manufacturer{
	default public Shoe make() {
		return makeShoe();
	}
	public Shoe makeShoe();
}
interface Seller{
	public Shoe sell(Customer customer);
}
interface ShoeSeller extends Seller{
	default public Shoe sell(Customer customer) {
		return sellShoe(customer);
	}
	public Shoe sellShoe(Customer customer);
}
class Customer{
	String name;
}
abstract class ShoeFactory implements ShoeManufacturer{
	
}
class BataShoeFactory extends ShoeFactory{
	@Override
	public Shoe makeShoe() {
		return new LeatherShoe();
	}
}
class LakhaniShoeFactory extends ShoeFactory{
	@Override
	public Shoe makeShoe() {
		return new SportsShoe();
	}
}
abstract class ShoeShop implements ShoeSeller{
	private ShoeFactory factory;
	public void setFactory(ShoeFactory factory) {
		this.factory=factory;
	}
	public ShoeFactory getFactory() {
		return this.factory;
	}
}
class RamuShoeShop extends ShoeShop{
	@Override
	public Shoe sellShoe(Customer customer) {
		// TODO Auto-generated method stub
		return getFactory().makeShoe();
	}
}