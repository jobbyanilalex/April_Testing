package Demoarray;

public class Array_oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,4,7,9};
		int oddcount=0;
		int evencount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println("Even number count ="+evencount);
		System.out.println("Odd number count ="+oddcount);

	}

}
