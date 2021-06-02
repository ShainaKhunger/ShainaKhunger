package polymorphism;

public class Child_OverRiding extends Parent_OverRiding {
	
	
	public void print()
	{
		System.out.println("Child");
	}

	public static void main(String[] args) {
		
		Parent_OverRiding obj = new Parent_OverRiding();
		obj.print();

	}

}
