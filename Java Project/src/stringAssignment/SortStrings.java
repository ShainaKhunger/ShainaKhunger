package stringAssignment;

import java.util.Arrays;

public class SortStrings {

	public static void main(String[] args) {
		 String[] strvalues = new String[]{"Java", "C#", "Manual", "automation"};
         Arrays.sort(strvalues);

       System.out.println("String array sorted (CASE SENSITIVE ORDER)");
        for(int i=0; i < strvalues.length; i++)
        {
           System.out.println(strvalues[i]);
       }
        
       Arrays.sort(strvalues, String.CASE_INSENSITIVE_ORDER);
       
        System.out.println("String array sorted (CASE INSENSITIVE ORDER)");
        
         for(int i=0; i < strvalues.length; i++)
         {
           System.out.println(strvalues[i]);

        }
	}
}



