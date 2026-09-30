package Inheritance;

class Library{
	void showBooks() {
		String name="Pokemon";
		String author="Ash";
		System.out.println("Book Name :"+name);
		System.out.println("Author Name :"+author);
	}
}
class Member extends Library{
	void borrowBook() {
		System.out.println("Already sold");
	}
}
public class New_single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj=new Member();
		obj.showBooks();
		obj.borrowBook();
	}

}
