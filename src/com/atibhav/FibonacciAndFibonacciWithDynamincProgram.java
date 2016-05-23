package com.atibhav;

public class FibonacciAndFibonacciWithDynamincProgram {
	
	private static int[] arr;
	public static void main(String[] args) {
		arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		arr[0] = 0;
		arr[1] = 1;
		int sum = fibonacciNumber(5);
		System.out.println("Fib nth Term ="+ sum);
	}

	private static int fibonacciNumber(int n) {
		// 0, 1, 1, 2, 3, 5, 8, 13…
		if(arr[n] != -1){
			return arr[n];
		}
		// Already init so ccan be removed.
		//		if(n < 1)
		//			return 0;
		//		if(n == 1)
		//			return 1;
		arr[n] = fibonacciNumber(n-1)+fibonacciNumber(n-2);
		return arr[n];
		// If variable is repeating I can inline them !!!
		//		int value = fibonacciSum(n-1)+fibonacciSum(n-2);
		//		arr[n] = value;
		//		return value;	
	}
	


//	public static void main(String[] args) {
//	int sum = fibonacciNumnber(5);
//	System.out.println("Fib Number  ="+ sum);
//}
//
//private static int fibonacciNumnber(int n) {
//	// 0, 1, 1, 2, 3, 5, 8, 13… 
//	if(n < 1)
//		return 0;
//	if(n == 1)
//		return 1;
//	return fibonacciNumnber(n-1)+fibonacciNumnber(n-2);
//}
}


