package constructors;

public class DefaultConstructor {
	
	int id;
	String name;
	
	void display()
	{
		System.out.println(id +" "+ name);
	}

	public static void main(String[] args) {
		
		DefaultConstructor obj1 = new DefaultConstructor();
		DefaultConstructor obj2 = new DefaultConstructor();
		
		obj1.display();
		obj2.display();
	}

}
