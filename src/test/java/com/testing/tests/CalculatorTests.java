package com.testing.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testing.service.CalculatorService;

public class CalculatorTests {

	@Test(groups = "smoke")
	public void verifyAddition() {
		CalculatorService service = new CalculatorService();
		int result = service.add(2, 3);
		Assert.assertEquals(result, 5);

	}

	@Test(groups = "regression")
	public void verifyMultiplication() {
		CalculatorService service = new CalculatorService();
		int result = service.multiply(3, 4);
		Assert.assertEquals(result, 12);

	}

}