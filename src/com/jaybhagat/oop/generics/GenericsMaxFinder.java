package com.jaybhagat.oop.generics;

/*
 * class to find the max form three Integers, Doubles, Strings using generics
 * @author com.jaybhagat
 */

public class GenericsMaxFinder {
	public static void main(String[] args) {
		String firstString = "Apple";
		String secondString = "Peach";
		String thirdString = "Banana";
		
		Integer firstIntNumber = 12;
		Integer secondIntNumber = 15;
		Integer thirdIntNumber = 20;
		
		Double firstDoubleNumber = 120.295;
		Double secondDoubleNumber = 150.255;
		Double thirdDoubleNumber = 200.326;
		
		getMax(firstString,secondString,thirdString);                       // method for string
		getMax(firstIntNumber,secondIntNumber,thirdIntNumber);              // method for integer
		getMax(firstDoubleNumber,secondDoubleNumber,thirdDoubleNumber);     // method for double
	}
	
	/*
	 * using generics type T which extends java comparable interface
	 * using java compareTo method to test maximum from Integer, Double and Strings
	 */
	private static <T extends Comparable<T>> void getMax(T firstVar, T secondVar, T thirdVar) {
		T maxVar = firstVar;
		
		if (secondVar.compareTo(maxVar) > 0)
			maxVar = secondVar;
		if (thirdVar.compareTo(maxVar) > 0)
			maxVar = thirdVar;
		System.out.println("The Maximum is : " +maxVar);
	}
}