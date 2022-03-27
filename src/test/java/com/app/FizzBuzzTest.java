package com.app;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	// Normal Numbers Return Same Number

	@Test
	public void oneReturnOne() {
		Assert.assertEquals("1", FizzBuzz.generateResultFuzzBuzz1(1));
	}

	// Multiples of Three Return Fizz

	@Test
	public void threeReturnFizz() {
		Assert.assertEquals(FizzBuzzConstants.FIZZ, FizzBuzz.generateResultFuzzBuzz1(3));
	}

	// Multiples of Five Return Buzz

	@Test
	public void fiveReturnBuzz() {
		Assert.assertEquals(FizzBuzzConstants.BUZZ, FizzBuzz.generateResultFuzzBuzz1(5));
	}

	// Multiples of Three and Five Return Fizz Buzz

	@Test
	public void fifteenReturnFizzBuzz() {
		Assert.assertEquals(FizzBuzzConstants.FIZZ_BUZZ, FizzBuzz.generateResultFuzzBuzz1(15));
	}

	@Test
	public void allcondtionsFizzBuzz() {
		Assert.assertEquals("1", FizzBuzz.generateResultFuzzBuzz1(1));
		Assert.assertEquals("2", FizzBuzz.generateResultFuzzBuzz1(2));
		Assert.assertEquals("4", FizzBuzz.generateResultFuzzBuzz1(4));
		Assert.assertEquals(FizzBuzzConstants.FIZZ_BUZZ, FizzBuzz.generateResultFuzzBuzz1(15));
		Assert.assertEquals(FizzBuzzConstants.FIZZ_BUZZ, FizzBuzz.generateResultFuzzBuzz1(45));
		Assert.assertEquals(FizzBuzzConstants.FIZZ_BUZZ, FizzBuzz.generateResultFuzzBuzz1(315));
		Assert.assertEquals(FizzBuzzConstants.BUZZ, FizzBuzz.generateResultFuzzBuzz1(5));
		Assert.assertEquals(FizzBuzzConstants.BUZZ, FizzBuzz.generateResultFuzzBuzz1(20));
		Assert.assertEquals(FizzBuzzConstants.BUZZ, FizzBuzz.generateResultFuzzBuzz1(200));
		Assert.assertEquals(FizzBuzzConstants.FIZZ, FizzBuzz.generateResultFuzzBuzz1(3));
		Assert.assertEquals(FizzBuzzConstants.FIZZ, FizzBuzz.generateResultFuzzBuzz1(9));
		Assert.assertEquals(FizzBuzzConstants.FIZZ, FizzBuzz.generateResultFuzzBuzz1(123));
	}

}
