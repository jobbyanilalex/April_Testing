package java_basics;

public class Met_cube {
	public int cube(int n) {
		int cu=n*n*n;
		return cu;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Met_cube obj=new Met_cube();
		int result=obj.cube(5);
			System.out.println("Cube = "+result);

	}

}
