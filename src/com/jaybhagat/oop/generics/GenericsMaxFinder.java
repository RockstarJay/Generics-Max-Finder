package com.jaybhagat.oop.generics;

/*
 * class to find the max form three String using generics
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class GenericsMaxFinder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter First String : ");
		String firstString = scanner.next();
		
		System.out.print("Enter Second String : ");
		String secondString = scanner.next();
		
		System.out.print("Enter Third String : ");
		String thirdString = scanner.next();
		scanner.close();
		
		getMax(firstString,secondString,thirdString);   // method for Double
	}
	
	/*
	 * using generics type T which extends java comparable interface
	 * java compareTo method to find max String using generics
	 */
	private static <T extends Comparable<T>> void getMax(T firstString, T secondString, T thirdString) {
		T maxString = firstString;
		
		if (secondString.compareTo(maxString) > 0)
			maxString = secondString;
		if (thirdString.compareTo(maxString) > 0)
			maxString = thirdString;
		System.out.println("The Max Sting is : " +maxString);
	}
}