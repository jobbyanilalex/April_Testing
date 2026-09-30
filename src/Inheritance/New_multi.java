package Inheritance;

class Appliance{
	void brand() {
		String company="Bosch";
		System.out.println("Comapny :"+company);
	}
	
}

class WashingMachine extends Appliance{
	void spec() {
		String capacity="8Kg";
		int rpm=1000;
		int price=45000;
		System.out.println("-----");
		System.out.println("Capacity :"+capacity);
		System.out.println("RPM :"+rpm);
		System.out.println("Price :"+price);
	}
	
}

class AutomaticWashingMachine extends WashingMachine{
	void spec1() {
		String capacity="10Kg";
		int rpm=3000;
		int price=95000;
		System.out.println("-----");
		System.out.println("Capacity :"+capacity);
		System.out.println("RPM :"+rpm);
		System.out.println("Price :"+price);
	}
}
public class New_multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutomaticWashingMachine obj=new AutomaticWashingMachine();
		obj.brand();
		obj.spec();
		obj.spec1();
	}

}
