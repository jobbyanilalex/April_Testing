package Encapsulation;

public class Student {
	
	private String name;
	private int marks;
	
	public void setname(String nname) {
		name=nname;
	}
	public void setmarks(int marks) {
			
		if(marks>=0 && marks<=100) {
			this.marks=marks;
		}
		else {
			System.out.println("Invalid Input");
		}
	}
	
	public String getname() {
		return name;
	}
	public int getmarks() {
		return marks;
	}
	
	public char calculateGrade() {
		if(marks>=90 && marks<=100) {
			return 'A';
		}
		else if(marks>=80 && marks<=89){
			return 'B';								
		}
		else if(marks>=70 && marks<=79) {
			return 'C';
		}
		else if(marks>=60 && marks<=69){
			return 'D';								
		}
		else {
			return 'F';
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
