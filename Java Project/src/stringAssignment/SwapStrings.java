package stringAssignment;

public class SwapStrings {

	public static void main(String[] args) {

        String a = "check";
        String b = "code";
        String temp;
        
        System.out.println("Before Swaping: " + a + " " + b);
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("After Swaping: " + a + " " + b);

	}

}
