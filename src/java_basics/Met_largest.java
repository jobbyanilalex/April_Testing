package java_basics;

public class Met_largest {
	
	public int largest(int a,int b,int c) {
		if(a>=b && a>=c) {
			return a;
		}
		else if(b>=a && b>=c) {
			return b;
		}
		else {
			return c;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Met_largest obj=new Met_largest();
			int result=obj.largest(10,20,15);
			System.out.println("Largest Number = "+result);

	}

}
