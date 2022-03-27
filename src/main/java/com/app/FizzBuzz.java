package com.app;

public class FizzBuzz {
	
	public static String generateResultFuzzBuzz1(int number) {
		if (number % 3 == 0)
			return FizzBuzzConstants.FIZZ;	
		return Integer.toString(number);
	}

}
