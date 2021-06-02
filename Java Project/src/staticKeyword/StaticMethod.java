package staticKeyword;

public class StaticMethod {

	int rollno;
	String name;
	static String college = "PU";
	
	//Constructor
	
	StaticMethod(int r, String n)
	{
		rollno = r;
		name = n;
	}
	
	static void change()
	{
		college = "Chandigarh University";
	}
	
	void display()
	{
		System.out.println(rollno +" " + name +" " + college);
	}
	
	
	public static void main(String[] args) {
		
		StaticMethod.change();
		
		StaticMethod obj = new StaticMethod(234, "Aryan");
		StaticMethod obj1 = new StaticMethod(144, "Sanam");
		StaticMethod obj2 = new StaticMethod(653, "Martina");
		
		
		obj.display();
		obj1.display();
		obj2.display();
	}



}
