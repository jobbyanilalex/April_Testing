package Democollection;

import java.util.ArrayList;
import java.util.List;



public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList mylist=new ArrayList();
		ArrayList<String> mylist1=new ArrayList<>();
		List mylist2=new ArrayList();
		
		mylist.add(12);
		mylist.add("jobby");
		mylist.add(22.5);
		
		mylist.add(null);
		mylist.add(null);
		
		System.out.println(mylist);
		
		System.out.println(mylist.size());
		
		mylist.remove(0);
		System.out.println(mylist.get(1));
		
		
		
	}

}
