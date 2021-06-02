package java_Test;

public class MyBook extends Book{

	public static void main(String[] args) {
		
		MyBook b= new MyBook();
		b.setTitle("A tale of two cities");
		System.out.println("The title is:" +b.getTitle());
	}

	@Override
	void setTitle(String s) {
		title =s;
		
	}

}
