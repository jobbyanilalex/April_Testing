package java_basics;

public class Met_average {
	public int average(int a,int b,int c) {
		int avg=(a+b+c)/3;
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Met_average obj=new Met_average();
		int result=obj.average(12,10,8);
			System.out.println("Average = "+result);

	}

}
