package java_basics;

import java.util.Scanner;

public class Sds_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit=0,spch=0,space=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String s=sc.nextLine();
		
		for(int i=0;i<s.length();i++) {

            char ch=s.charAt(i);

            if(Character.isDigit(ch)){
                digit++;
            }
            else if(Character.isWhitespace(ch)){
                space++;
            }
            else if(!Character.isLetter(ch)){
                spch++;
            }
        }
		System.out.println("Special Characters ="+spch);
		System.out.println("Spaces ="+space);
		System.out.println("Digits ="+digit);
		
		sc.close();
	}
	
}
