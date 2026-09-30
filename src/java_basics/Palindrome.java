package java_basics;

import java.util.Scanner;

public class Palindrome {

	public void checkPalindrome(String s) {
       

        String reverse="";

        for(int i=s.length()-1;i>=0;i--) {
            reverse=reverse+s.charAt(i);
        }

        if(s.equals(reverse)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input=sc.nextLine();

        Palindrome obj = new Palindrome();
        obj.checkPalindrome(input);

        sc.close();
	}

}
