package java_basics;

public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int num=2561;
        while(num!=0){
            int digit=num%10; 
            sum=sum+digit;    
            num=num/10;       
        }
        System.out.println("Sum of digits = "+ sum);
	}

}
