package com.atibhav;

public class FibonacciAndFibonacciWithDynamincProgramV2 {
	
	public static void main(String[] args) {
		int sum = fib();
		System.out.println("Fib nth Term ="+ sum);
	}

	private static int fib() {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		arr[0] = 0;
		arr[1] = 1;
		return fibonacciNumber(arr, 5);
	}

	private static int fibonacciNumber(int[] arr, int n) {
		// 0, 1, 1, 2, 3, 5, 8, 13…
		if(arr[n] != -1){
			return arr[n];
		}
		arr[n] = fibonacciNumber(arr, n-1)+fibonacciNumber(arr, n-2);
		return arr[n];
	}
}


