package testing;

public class Demo {
	
	int id;
	String name;
	
	Demo(int i, String n)
	{
		id = i;
		name= n;
	}
	
	void display()
	{
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		
		Demo obj = new Demo(1, "ghf");
		Demo obj1 = new Demo(2,"fgh");
		
		obj.display();
		obj1.display();

		/*
		 * char[] ch= new char[] {'S','h','a','i','n','a'};
		 * 
		 * for(char name: ch) { System.out.println(name); }
		 * 
		 * char[] ch1 =new char[] {'S','a','m','a','r','B','a','j','a','j'};
		 * 
		 * System.out.println("");
		 * 
		 * for(char nam: ch1) {
		 * 
		 * System.out.println(nam); }
		 * 
		 * for(int i=0; i<ch1.length; i++) { if(i%5==0)
		 * System.out.println("Divisible by 5"); else
		 * System.out.println("Not divisible"); }
		 */
		System.out.println("-----------------------------------------------------");

		
		/*
		 * int[] [] ar= new int[3][4]; ar[0][0] =12; ar[0][1] =28; ar[0][2] =10;
		 * ar[1][0] =17; ar[1][1] =27; ar[1][2] =154; ar[2][0] =757897;
		 * System.out.println(ar.length);
		 * 
		 * for(int i=0; i<ar.length; i++) { for(int j=0; j<ar.length; j++) {
		 * System.out.println(ar[i][j]); } }
		 */
		
		
	}

}
