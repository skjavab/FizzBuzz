package com.app;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void oneReturnOne() {
		Assert.assertEquals("1", FizzBuzz.generateResultFuzzBuzz1(1));
	}
	
	@Test
	public void threeReturnFizz() {
		Assert.assertEquals(FizzBuzzConstants.FIZZ, FizzBuzz.generateResultFuzzBuzz1(3));
	}
	
	@Test
	public void fiveReturnBuzz() {
		Assert.assertEquals(FizzBuzzConstants.BUZZ, FizzBuzz.generateResultFuzzBuzz1(5));
	}
	
	@Test
	public void fifteenReturnFizzBuzz() {
		Assert.assertEquals(FizzBuzzConstants.FIZZ_BUZZ, FizzBuzz.generateResultFuzzBuzz1(15));
	}
	
	

}
