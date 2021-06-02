package inheritance;

public class ChildClass extends ParentClass {
	
	public ChildClass()
	{
		super();
		System.out.println("ChildClass");
	}
	
	public void display1()
	{	
		System.out.println("abc");
	}

	public static void main(String[] args) {

		ParentClass obj = new ParentClass();
		obj.display();
		
		ChildClass obj1 = new ChildClass();
		obj1.display1();
	}

}
