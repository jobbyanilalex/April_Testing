package Data_Abstraction;

import java.util.Scanner;

abstract class Shape{
	public abstract void calculateArea();
	
}

class Circle extends Shape{
	public void calculateArea() {
		int r=2;
		double area_cir=3.14*r*r;
		System.out.println("Area of circle ="+area_cir);
	}
}
class Rectangle extends Shape{
	public void calculateArea() {
		int l=4;
		int b=7;
		int area_rec=l*b;
		System.out.println("Area of rectangle ="+area_rec);
	}	
}
	
class Triangle extends Shape{
	public void calculateArea() {
		int b=5;
		int h=3;
		double area_tri=0.5*b*h;
		System.out.println("Area of triangle ="+area_tri);
	}
}

public class Task1_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Circle obj=new Circle();
		Rectangle obj1=new Rectangle();
		Triangle obj2=new Triangle();
		
		System.out.println("Enter your choice(1,2,3) :");
		int ch=sc.nextInt();
		
		switch (ch) {
		
		case 1: 
			obj.calculateArea();
		break;
			
		case 2:
			obj1.calculateArea();
		break;
		
		case 3:
			obj2.calculateArea();
		break;	
		
		default:
			System.out.println("Invalid choice");
		break;	
		}
			
	}

}
