package staticKeyword;

public class StaticVariable {
	
	int rollno;
	String name;
	static String college ="ABC";
	
	// constructor
	
	StaticVariable(int r, String n)
	{
		rollno= r;
		name= n;
		
	}
	
	void display() 
	{
		System.out.println(rollno +" " + name + " " + college);
	}
	

	public static void main(String[] args) {
		
		StaticVariable obj = new StaticVariable(101, "Kiara");
		StaticVariable obj1 = new StaticVariable(102, "Aaruhi");
		
		obj.display();
		obj1.display();
		

		
		

	}

}
