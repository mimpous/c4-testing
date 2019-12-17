package com.udacity.examples.Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class HelperParametrizedTest {

	private String input;
	
	private String output;

	public HelperParametrizedTest(String input, String output) {
		super();
		this.input = input;
		this.output = output;
	}
	
	public HelperParametrizedTest(String input) {
		super();
		this.input = input;
	}
	 
	@Parameters
	public static Collection initData() {
		String empName[][] = {{"mike", "mike"},{"mike", "george"}};
		return Arrays.asList(empName);
	}
	
	@Test
	public void verifyInputNameIsNotTheSameAsTheOutputName() {
		assertNotEquals(input, output);
	}
}
