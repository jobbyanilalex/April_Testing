package Encapsulation;

public class Nstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj=new Student();
		
		obj.setname("Rahul");
		obj.setmarks(77);
		
		System.out.println("Name :"+obj.getname());
		System.out.println("Mark :"+obj.getmarks());
		System.out.println("Grade :"+obj.calculateGrade());
	}

}
