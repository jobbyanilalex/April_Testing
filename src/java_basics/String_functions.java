package java_basics;

public class String_functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//STRING FUNCTIONS
		String s1="hello";
		String s2="HELLO";
		
		System.out.println(s1.length());
		System.out.println(s2.charAt(3));
		System.out.println(s1.concat(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.contains("hel"));//true
		System.out.println(s2.contains("hel"));//false
		
		System.out.println(s1.endsWith("lo"));
		System.out.println(s2.startsWith("HE"));
		System.out.println(s1.replace("hello","new"));
		
		String s3=" hello world";
		System.out.println(s3.trim());//Remove all white spaces from front and back
		
		String s4="hello 123";
		System.out.println(s4.replaceAll("\\d","*"));//Remove numeric values
		System.out.println(s4.replaceAll("\\s","#"));//Remove spaces
		
		String s5="good morning";
		System.out.println(s5.substring(5));
		System.out.println(s5.substring(1,6));
		System.out.println(s5.isEmpty());
		
		//CHARACTER FUNCTIONS
		
		char ch=s5.charAt(6);//o
		System.out.println(Character.toLowerCase(ch));
		System.out.println(Character.toUpperCase(ch));
		System.out.println(Character.isLetter(ch));
		System.out.println(Character.isDigit(ch));
		System.out.println(Character.isWhitespace(ch));
		
		
	}

}
