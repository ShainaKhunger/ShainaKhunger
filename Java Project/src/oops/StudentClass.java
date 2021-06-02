package oops;

public class StudentClass {
	
	String name = "Alison";
	int rollno = 101;
	int age = 15;
	static String section = "B";
	
	void get_Data(String n, int r, int a, String s)
	{
		name = n;
		rollno = r;
		age = a;
		section = s;
		
	}
	
	void display()
	{
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(age);
		System.out.println(section);
	}

	
	public static void main(String[] args) {
		
		StudentClass obj = new StudentClass();
		
			obj.display();
			System.out.println("*******");
			System.out.println(obj.age);
			
			obj.name = "Emma";
			System.out.println(obj.name);
			
			
			System.out.println(StudentClass.section);
			
			obj.get_Data("Martina", 111, 14, "A");
			System.out.println(obj.name);
			System.out.println(StudentClass.section);
	}

}
