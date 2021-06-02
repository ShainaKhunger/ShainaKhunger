package stringAssignment;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String blogName = "how to   do    in  java   .         com"; 
		 
		String nameWithProperSpacing = blogName.replaceAll("\\s+", " ");
		 
		System.out.println( nameWithProperSpacing );
	}

}
