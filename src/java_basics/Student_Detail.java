package java_basics;

import java.util.Scanner;

public class Student_Detail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String st=sc.nextLine();
		System.out.println("Enter Student Roll No : ");
		int rl=sc.nextInt();
		System.out.println("Enter Student Phone No : ");
		long ph=sc.nextLong();
		System.out.println("Enter Student Marks(3 Subjects) : ");
		float m1=sc.nextFloat();
		float m2=sc.nextFloat();
		float m3=sc.nextFloat();
		float avg=(m1+m2+m3)/3;
		
		System.out.println("---Student Details---");
		System.out.println("Student Name : "+st);
		System.out.println("Student Roll No : "+rl);
		System.out.println("Student Phone No : "+ph);
		System.out.println("Student Marks(3 Subjects) : "+m1 + ","+m2 +","+m3);
		System.out.println("Average Marks : "+avg);
		
		sc.close();
		

	}

}
