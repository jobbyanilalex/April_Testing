package java_basics;


public class New_area {
	
	static public void circle(int rad) {

		double area_cir=3.14*rad*rad;
		System.out.println("Area of circle="+area_cir);
	}
	static public void triangle(int base,int hei) {

		double area_tri=0.5*base*hei;
		System.out.println("Area of triangle="+area_tri);
	}
	public int rectangle() {
		int len=40,bred=5;
		int area_rect=len*bred;
		return area_rect;
	}
	public void square(int side) {
	
		int area_squ=side*side;
		System.out.println("Area of square = "+area_squ);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		New_area obj=new New_area();
		circle(4);
		triangle(20,5);
		int a=obj.rectangle();
			System.out.println("Area of rectangle = "+a);
		obj.square(6);
			

	}

}
