package Democollection;

import java.util.ArrayList;

public class Prog_cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cart=new ArrayList();
		
		cart.add("Laptop");
		cart.add("Mobile");
		cart.add("Ipad");
		cart.add("Keyboard");
		cart.add("Speaker");
		cart.add("Earbud");
		
		System.out.println(cart);
		
		cart.remove(4);
		System.out.println(cart);
		
		if(cart.contains("Laptop")) {
			System.out.println("Laptop present in cart");
		}
		else {
			System.out.println("Laptop not present in cart");
		}
		
		for(Object a:cart) {
			System.out.println(a);
		}
	}

}
