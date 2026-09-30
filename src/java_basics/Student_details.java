package java_basics;

public class Student_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Jobby Anil ALex";
		int age=24;
		long phone=8356626237l;
		int maths=60;
		int english=78;
		int computer=80;
		int science=75;
		int sum=maths+english+computer+science;
		float avg=sum/4f;
		
		System.out.println("------Student Details------");
		System.out.println("Name                      :"+name);
		System.out.println("Age                       :"+age);
		System.out.println("Phone                     :"+phone);
		System.out.println("Maths                     ="+maths);
		System.out.println("English                   ="+english);
		System.out.println("Computer                  ="+computer);
		System.out.println("Science                   ="+science);
		System.out.println("Total marks of 4 subjects ="+sum);
		System.out.println("Average of 4 subjects     = "+avg);


	}

}
