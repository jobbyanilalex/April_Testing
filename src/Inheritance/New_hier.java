package Inheritance;

class Shape{
	void calculateArea() {
		System.out.println("--Area of different shapes--");
	}
}
class Circle extends Shape{
	void calculateArea() {
		int r=2;
		double area=3.14*r*r;
		System.out.println("Area of circle ="+area);
	}
}
class Rectangle extends Shape{
	void calculateArea() {
		int l=2,b=7;
		int area=l*b;
		System.out.println("Area of rectangle="+area);
	}
}
class Triangle extends Shape{
	void calculateArea() {
		int base=10;
		int hei=5;
		double area=0.5*base*hei;
		System.out.println("Area of triangle ="+area);
	}
}
public class New_hier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj=new Circle();
		obj.calculateArea();
		
		
		Rectangle obj1=new Rectangle();
		obj1.calculateArea();
		
		
		Triangle obj2=new Triangle();
		obj2.calculateArea();
		
	
	}

}
