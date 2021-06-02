package staticKeyword;

public class StaticClass {

	static int rollno = 245;
	
	static class Inner {
	
	void display()
	{
		System.out.println("RollNo is" + " " + rollno);
	}
	
	public static void main(String[] args) {
	
		StaticClass.Inner obj = new StaticClass.Inner();
		obj.display();

	}

}
}