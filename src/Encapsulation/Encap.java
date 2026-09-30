package Encapsulation;

public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap_test obj=new Encap_test();
		
		obj.setname("jobby");
		obj.setage(24);
		obj.setid(7);
		
		System.out.println("Name :"+obj.getname()+"\n"+"Age :"+obj.getage()+"\n"+"Id :"+obj.getid());

	}

}
