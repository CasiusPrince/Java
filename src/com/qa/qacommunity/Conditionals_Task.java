package com.qa.qacommunity;

public class Conditionals_Task {

	public static void main(String[] args) {
		System.out.println(addition(10, 20));
		System.out.println(multiply(100, 100));
		System.out.println(subtract(150, 50));
		divide(40, 60);

	}

	private static int addition(int num1, int num2) {
		return num1 + num2;
	}

	private static int multiply(int num1, int num2) {
		return num1 * num2;
	}

	private static int subtract(int num1, int num2) {
		return num1 - num2;
	}

	private static void divide(double num1, double num2) {
		

		if (num1 <= num2) {
			System.out.println("Can not do division");
			}else { System.out.println( num1 / num2); }

		
		
	}
}
