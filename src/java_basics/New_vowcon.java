package java_basics;

import java.util.Scanner;

public class New_vowcon {
	
	public void vowcon(String s) {
		int vowels=0;
		int consonants=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);

	        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

	            vowels++;
	        }
	        else if(ch>='a'&&ch<='z'){
	            consonants++;
	        }
		}
		System.out.println("Vowels = "+vowels);
		System.out.println("Consonants = "+consonants);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String input=sc.nextLine();
		
		New_vowcon obj=new New_vowcon();
		obj.vowcon(input);
		
		sc.close();
		
	}

}
