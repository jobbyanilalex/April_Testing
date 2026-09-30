package Demoarray;

import java.util.Scanner;

public class Array_sc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements :");
		int[] a=new int[5];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int b:a) {
			System.out.print(" "+b);
		}
		try {
			System.out.println("Enter index :");
			int in=sc.nextInt();
			System.out.println(a[in]);		
		}
		catch (Exception e) {
			e.printStackTrace();

	}
	}
}
