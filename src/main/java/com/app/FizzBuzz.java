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
		String result = null;
		if (number % 105 == 0)
			result = FizzBuzzConstants.FIZZ_BUZZ_POP; // Multiples of Three, Five and Seven Return Fizz Buzz Pop
		else if (number % 35 == 0)
			result = FizzBuzzConstants.BUZZ_POP; // Multiples of Five and Seven Return Buzz Pop
		else if (number % 21 == 0)
			result = FizzBuzzConstants.FIZZ_POP; // Multiples of Three and Seven Return Fizz Pop
		else if (number % 7 == 0)
			result = FizzBuzzConstants.POP; // Multiples of Seven Return Pop
		return result == null ? Integer.toString(number) : result;
	}

	public static String generateResultFuzzBuzz3() {
		// TODO Auto-generated method stub
		return "1";
	}

}
