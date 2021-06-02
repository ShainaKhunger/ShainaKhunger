package constructors;

public class ParameterizedConstructor {
	
	int id;
	String name;
	
	ParameterizedConstructor(int i, String n)
	{
		id = i;
		name = n;
	}
	
	void display()
	{
		System.out.println(id +" "+ name);
	}
	

	public static void main(String[] args) {
		ParameterizedConstructor obj1 = new ParameterizedConstructor(111, "Aarav");
		ParameterizedConstructor obj2 = new ParameterizedConstructor(112, "Karan");
		
		obj1.display();
		obj2.display();
	}
}
