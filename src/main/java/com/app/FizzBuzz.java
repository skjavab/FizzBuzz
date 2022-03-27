package com.app;

public class FizzBuzz {

	public static String generateResultFuzzBuzz1(int number) {
		if (number % 15 == 0)
			return FizzBuzzConstants.FIZZ_BUZZ;
		else if (number % 3 == 0)
			return FizzBuzzConstants.FIZZ;
		else if (number % 5 == 0)
			return FizzBuzzConstants.BUZZ;
		return Integer.toString(number);
	}

}
