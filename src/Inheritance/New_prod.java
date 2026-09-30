package Inheritance;

class Product{
	void product() {
		int id=1;
		String name="Mobile";
		int price=10000;
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Price :"+price);
		
	}
}
class Electronics extends Product{
	void warranty(){
		String warranty="3 years";
		System.out.println("Warranty :"+warranty);
	}
}
class Clothing extends Product{
	void size(){
		String size="Large";
		System.out.println("Size:"+size);
	}
}
public class New_prod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electronics obj=new Electronics();
		obj.product();
		obj.warranty();
		
		Clothing obj1=new Clothing();
		obj1.product();
		obj1.size();
	}

}
