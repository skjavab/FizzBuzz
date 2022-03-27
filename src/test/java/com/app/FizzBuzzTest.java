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

	// Multiples of Seven Return Pop
	@Test
	public void sevenReturnPop() {
		Assert.assertEquals(FizzBuzzConstants.POP, FizzBuzz.generateResultFuzzBuzz2(7));
	}

	// Multiples of Three and Seven Return Fizz Pop
	@Test
	public void twentyOneReturnFizPop() {
		Assert.assertEquals(FizzBuzzConstants.FIZZ_POP, FizzBuzz.generateResultFuzzBuzz2(21));
	}

	// Multiples of Three and Seven Return Fizz Pop
	@Test
	public void thirtyFiveReturnBuzzPop() {
		Assert.assertEquals(FizzBuzzConstants.BUZZ_POP, FizzBuzz.generateResultFuzzBuzz2(35));
	}

	// Multiples of Three, Five and Seven Return Fizz Buzz Pop

	@Test
	public void hundredenFiveReturnFizzBuzzPop() {
		Assert.assertEquals(FizzBuzzConstants.FIZZ_BUZZ_POP, FizzBuzz.generateResultFuzzBuzz2(105));
	}

	@Test
	public void allcondtionsFizzBuzz2() {
		Assert.assertEquals(FizzBuzzConstants.POP, FizzBuzz.generateResultFuzzBuzz2(28));
		Assert.assertEquals(FizzBuzzConstants.POP, FizzBuzz.generateResultFuzzBuzz2(77));
		Assert.assertEquals(FizzBuzzConstants.BUZZ_POP, FizzBuzz.generateResultFuzzBuzz2(70));
		Assert.assertEquals(FizzBuzzConstants.BUZZ_POP, FizzBuzz.generateResultFuzzBuzz2(140));
		Assert.assertEquals(FizzBuzzConstants.FIZZ_POP, FizzBuzz.generateResultFuzzBuzz2(63));
		Assert.assertEquals(FizzBuzzConstants.FIZZ_POP, FizzBuzz.generateResultFuzzBuzz2(126));
		Assert.assertEquals(FizzBuzzConstants.FIZZ_BUZZ_POP, FizzBuzz.generateResultFuzzBuzz2(210));
		Assert.assertEquals(FizzBuzzConstants.FIZZ_BUZZ_POP, FizzBuzz.generateResultFuzzBuzz2(315));

	}

	@Test
	public void oneReturnOne1() {
		Assert.assertEquals("1", FizzBuzz.generateResultFuzzBuzz3(1));
	}
	@Test
	public void twoReturnFuzz() {
		Assert.assertEquals(FizzBuzzConstants.FUZZ, FizzBuzz.generateResultFuzzBuzz3(2));
	}
	@Test
	public void threeReturnBizz() {
		Assert.assertEquals(FizzBuzzConstants.BIZZ, FizzBuzz.generateResultFuzzBuzz3(3));
	}
	@Test
	public void twelveReturnFizzBuzz() {
		Assert.assertEquals(FizzBuzzConstants.FUZZ_BIZZ, FizzBuzz.generateResultFuzzBuzz3(12));
	}
	
	@Test
	public void allcondtionsFizzBuzz3() {
		Assert.assertEquals(FizzBuzzConstants.FUZZ, FizzBuzz.generateResultFuzzBuzz3(4));
		Assert.assertEquals(FizzBuzzConstants.FUZZ, FizzBuzz.generateResultFuzzBuzz3(8));
		Assert.assertEquals(FizzBuzzConstants.FUZZ, FizzBuzz.generateResultFuzzBuzz3(2));
		Assert.assertEquals(FizzBuzzConstants.BIZZ, FizzBuzz.generateResultFuzzBuzz3(9));
		Assert.assertEquals(FizzBuzzConstants.FUZZ_BIZZ, FizzBuzz.generateResultFuzzBuzz3(24));

	}
}
