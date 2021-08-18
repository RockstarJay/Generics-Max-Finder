package com.jaybhagat.oop.generics;

/*
 * class to find the maximum number form three integers using generics
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class GenericsMaxFinder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		Integer firstIntNumber = scanner.nextInt();
		
		System.out.print("Enter Second Number : ");
		Integer secondIntNumber = scanner.nextInt();
		
		System.out.print("Enter Third Number : ");
		Integer thirdIntNumber = scanner.nextInt();
		scanner.close();
		
		getMax(firstIntNumber,secondIntNumber,thirdIntNumber);   // method for integer
	}
	
	/*
	 * using generics type T which extends java comparable interface
	 * java compareTo method to find maximum number
	 */
	private static <T extends Comparable<T>> void getMax(T firstNumber, T secondNumber, T thirdNumber) {
		T maxNumber = firstNumber;
		
		if (secondNumber.compareTo(maxNumber) > 0)
			maxNumber = secondNumber;
		if (thirdNumber.compareTo(maxNumber) > 0)
			maxNumber = thirdNumber;
		System.out.println("The Maximum Number is : " +maxNumber);
	}
}