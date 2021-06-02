package java_Test;

public class Duplicate_Char {

	public static void main(String[] args) {
		
		String str = "JACKANDJILL";
		
	      char[] chara = str.toCharArray();
	      
	      System.out.println("The string is:" + str);
	      System.out.print("Duplicate Characters in above string are: ");
	      
	      for (int i = 0; i < str.length(); i++) 
	      {
	         for (int j = i + 1; j < str.length(); j++) 
	         {
	            if (chara[i] == chara[j]) 
	            {
	               System.out.print(chara[j] + " ");
	            
	            }

	         }
	      }
}
}
