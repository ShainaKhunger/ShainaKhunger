package polymorphism;

public class OverLoading {
	
	public int add (int a, int b, int c)
	{
		return a+b+c;
	}
	
	public int add (int a, int b)
	{
		return a+b;
	}

	public String add(String a, String b) 
	{
		String temp = a+b;
		return temp;
	}
	
	public static void main(String[] args) {
		
		OverLoading obj = new OverLoading();
		
		System.out.println(obj.add("Java", " Programming "));
		System.out.println(obj.add(140, 19));
		System.out.println(obj.add(26, 4, 5));
		

	}

}
