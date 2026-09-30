package java_basics;

public class Met_count {
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
		Met_count obj=new Met_count();
		int result=obj.countEven(30);
			System.out.println("Count of even numbers = "+result);

	}

}
