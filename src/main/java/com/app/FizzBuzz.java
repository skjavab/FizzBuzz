package com.app;

public class FizzBuzz {

	public static String generateResultFuzzBuzz1(int number) {
		String result = null;
		if (number % 15 == 0)
			result = FizzBuzzConstants.FIZZ_BUZZ; // Multiples of Three and Five Return Fizz Buzz
		else if (number % 3 == 0)
			result = FizzBuzzConstants.FIZZ; // Multiples of Five Return Buzz
		else if (number % 5 == 0)
			result = FizzBuzzConstants.BUZZ; // Multiples of Five Return Buzz
		return result == null ? Integer.toString(number) : result; // Normal Numbers Return Same Number
	}
	
	public static String generateResultFuzzBuzz2(int number) {
		if (number % 105 == 0)
			return  FizzBuzzConstants.FIZZ_BUZZ_POP;
		else  if (number % 35 == 0)
			 return FizzBuzzConstants.BUZZ_POP;
		 else if (number % 21 == 0)
			return FizzBuzzConstants.FIZZ_POP;
		else if (number % 7 == 0)
			 return FizzBuzzConstants.POP; // Multiples of Seven Return Pop
		return Integer.toString(number) ;
	}


}
