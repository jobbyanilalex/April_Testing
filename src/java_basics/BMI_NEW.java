package java_basics;


public class BMI_NEW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float height=1.7f;
		float weight=60f;
		
		float BMI=weight/(height*height);
		System.out.println("BMI="+BMI);

		if(BMI<18.5) {
			System.out.println("Underweight");
		}
		else if(BMI>=18.5 && BMI<=24.9) {
			System.out.println("Normal weight");
		}
		else if(BMI>=25.0 && BMI<=29.9) {
			System.out.println("Overweight");
		}
		else {
		    System.out.println("Obese");
		}
	}

}
