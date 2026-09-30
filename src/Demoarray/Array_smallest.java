package Demoarray;

public class Array_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={25,10,45,5,30};

        int smallest=a[0];

        for (int num:a) {
            if (num<smallest) {
                smallest=num;
            }
        }

        System.out.println("Smallest element = "+smallest);
		    
	}

}
