package demoexception;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter marks:");
            int marks=sc.nextInt();

            if (marks<0||marks>100) {
                System.out.println("Invalid marks");
            } else {
                System.out.println("Marks: " +marks);
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();

	}

}
