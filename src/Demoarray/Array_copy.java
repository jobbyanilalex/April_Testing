package Demoarray;

public class Array_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,3,6,7,9};
		int [] b= new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println("Copied Array");
		for(int c:b) {
			System.out.print(" "+c);
		}
		
	}
}
