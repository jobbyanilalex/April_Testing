package java_basics;

import java.util.Scanner;

public class New_counteven {

public int countEven(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		New_counteven obj=new New_counteven();
		
		System.out.print("Enter a number: ");
        int n=sc.nextInt();

        int result=obj.countEven(n);

        System.out.println("Number of even numbers from 1 to "+n+" = "+result);

        sc.close();

	}

}
