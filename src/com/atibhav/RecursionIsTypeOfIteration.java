package com.atibhav;

public class RecursionIsTypeOfIteration {
	
	public static void main(String[] args) {
		
		int count = 10;
		String printMe = "Hello from Atibhav !!!";
		
		// Iteration: Iteration in computing is the repetition of a block of statements within a computer program.
		for (int i = 0; i < count; i++) {
			System.out.println(printMe);
		}
		printMeUsingRecusion(count);
	}
	
	private static void printMeUsingRecusion(int count){
		
		// Recursion: Type of Iteration but using different notation !!
		if(count<1) return;
		System.out.println("Hello from Atibhav Count is !!!"+count);
		printMeUsingRecusion(count-1);
		System.out.println("Post Recursion count is " + count);
	}
}
