package java_basics;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123456;
		int count = 0;

        while(num!=0) {
            num=num/10;
            count++;
        }

        System.out.println("Number of digits = " + count);

	}

}
