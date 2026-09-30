package Demoarray;

import java.util.Arrays;

public class Array_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {1,2,4,5,6};
		
		System.out.println(a[2]);//4
		
		System.out.println(a.length);//5
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int n : a) {
			System.out.println(n);
		}
	}

}
