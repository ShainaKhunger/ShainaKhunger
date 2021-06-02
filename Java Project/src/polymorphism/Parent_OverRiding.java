package polymorphism;

public class Parent_OverRiding {
	
	public void print()
	{
		System.out.println("Parent");
	}


	
	public static void main(String[] args) {
		Child_OverRiding obj = new Child_OverRiding();
		obj.print();


}
}