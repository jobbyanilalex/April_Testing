package Encapsulation;

public class Nbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book obj=new Book();
		
		obj.settitle("Pokemon");
		obj.setauthor("Ash");
		
		System.out.println("Title :"+obj.gettitle()+"\n"+"Author :"+obj.getauthor());

	}

}
