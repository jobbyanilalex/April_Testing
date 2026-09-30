package Data_Abstraction;

abstract class Product{
	String ProductName;
	int price;
	
	public abstract void calculateDiscount(); 
}

class Electronics extends Product{
	public void calculateDiscount() {
		double discount=price*0.10; //10% discount
        System.out.println("Electronics Discount :"+discount);
	}
}
class Clothing extends Product{
	public void calculateDiscount() {
		double discount=price*0.20; //20% discount
        System.out.println("Clothing Discount :"+discount);		
	}
}
class Grocery extends Product{
	public void calculateDiscount() {
		double discount=price*0.05; //5% discount
        System.out.println("Grocery Discount :"+discount);
		
	}
}
public class Task3_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Electronics e=new Electronics();
	        e.ProductName="Laptop";
	        e.price=50000;
	        e.calculateDiscount();

	        Clothing c=new Clothing();
	        c.ProductName="Shirt";
	        c.price=2000;
	        c.calculateDiscount();

	        Grocery g=new Grocery();
	        g.ProductName="Rice";
	        g.price=1000;
	        g.calculateDiscount();
	}

}
