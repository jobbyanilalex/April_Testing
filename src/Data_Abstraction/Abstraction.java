package Data_Abstraction;

abstract class New{
	public abstract void image();
	public abstract void news();
	
	public void video() { //IN ABSTRACT CLASS WE CAN CREATE NORMAL METHOD WITH BODY
		System.out.println("play video");
	}
}
public class Abstraction extends New {
	
	public void image() {
		System.out.println("display image");
	}
	public void news() {
		System.out.println("display news");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction obj=new Abstraction();
		obj.image();
		obj.news();
		obj.video();

	}

}
