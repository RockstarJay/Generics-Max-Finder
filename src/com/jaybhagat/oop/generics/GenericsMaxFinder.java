package com.jaybhagat.oop.generics;

/*
 * class to find the maximum number form three double using generics
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class GenericsMaxFinder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter First Double Number : ");
		Double firstDoubleNumber = scanner.nextDouble();
		
		System.out.print("Enter Second Double Number : ");
		Double secondDoubleNumber = scanner.nextDouble();
		
		System.out.print("Enter Third Double Number : ");
		Double thirdDoubleNumber = scanner.nextDouble();
		scanner.close();
		
		getMax(firstDoubleNumber,secondDoubleNumber,thirdDoubleNumber);   // method for Double
	}
	
	/*
	 * using generics type T which extends java comparable interface
	 * java compareTo method to find maximum number using generics
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