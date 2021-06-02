package array;

public class CharacterArray {

	public static void main(String[] args) {
		
		char[] ch = new char[] {'s', 'o', 'f', 't', 'w', 'a', 'r', 'e'}; 
		
		/*for(int i=0; i<ch.length; i++)
		{
			System.out.println(ch[i]);
		}*/   
		
		// 2nd method
		
		for(char alp:ch)
		{
			System.out.println(alp);
		}
		
		System.out.println("");
		
		System.out.println("Last 4 Elements are: " + ch[4] + ch[5] + ch[6] + ch[7]);
		
		System.out.println("");
		
		char[] ch1= new char[7]; 
		
		ch1[0]= 'P';
		ch1[1]= 'r';
		ch1[2]= 'o';
		ch1[3]= 'g';
		ch1[4]= 'r';
		ch1[5]= 'a';
		ch1[6]= 'm';
		
		for(int j=0; j<ch1.length; j++)
		{
			System.out.println(ch1[j]);
			
		}
		System.out.println("");
		
		System.out.println("Last 4 Elements are: " + ch1[3] + ch1[4] + ch1[5] + ch1[6]);
		
		for(int j=0; j<ch1.length; j++)
		{
			if(j%5==0)
			
				System.out.println( ch1[j] + " index is divisible by 5 ");
				
			
			else

				System.out.println( ch1[j] + " not Divisible ");
		}
	}
}



