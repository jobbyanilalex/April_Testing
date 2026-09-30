package Demoarray;

import java.util.Scanner;

public class Array_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {2,3,4,5,6};
		Scanner sc=new Scanner(System.in);
		
		try {
            System.out.println("Enter index :");
            int n=sc.nextInt();

            System.out.println("Element =" +a[n]);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
	}

}
