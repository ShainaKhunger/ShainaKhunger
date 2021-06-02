package oops;

public class Final {

	 final void run()
	 {
		 System.out.println("running");
	 
	 }  
 
	}      
	class Honda extends Final
	{  
	    void run1()
	   {
		   System.out.println("running safely with 100kmph");
	   }  
 
	   public static void main(String args[])
	   {  
		   Honda obj= new Honda();  
		   obj.run();
	   
	   }  
	}  
