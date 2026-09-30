package java_basics;

public class Met_print {
	public void printSquares(int n) {
		for (int i=1; i<=n; i++) {
            System.out.println("Square of " + i +" = "+(i*i));
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Met_print obj=new Met_print();
		obj.printSquares(6);

	}

}
