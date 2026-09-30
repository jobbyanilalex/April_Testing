package demoexception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Checked {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		File obj=new File("Testing//news.txt");
		if(obj.createNewFile()) {
			System.out.println("File Created"+obj.getName());
		}
		else {
			System.out.println("File already exists");
		}
		FileWriter mywriter=new FileWriter("Testing//news.txt");
		mywriter.write("Hello,Welcome");
		mywriter.close();
		
		Thread.sleep(3000);
		System.out.println("End");
	}

}
