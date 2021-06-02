package finalKeyword;

public class FinalVariable {
	
	final int speedlimit = 60;
	
	void display()
	{
		System.out.println(speedlimit);
	}

	public static void main(String[] args) {
		
		FinalVariable obj = new FinalVariable();
		obj.display();
		
	}

}
