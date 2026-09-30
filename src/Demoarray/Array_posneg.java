package Demoarray;

public class Array_posneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {0,1,4,6,-1,-2};
		int pcount=0;
		int ncount=0;
		int zcount=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				pcount++;
			}
			else if(a[i]<0) {
				ncount++;
			}
			else {
				zcount++;
			}
		}
		System.out.println("Positive number count ="+pcount);
		System.out.println("Negative number count ="+ncount);
		System.out.println("Zero count ="+zcount);
	}

}
