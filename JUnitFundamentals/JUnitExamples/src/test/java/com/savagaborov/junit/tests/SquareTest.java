package com.savagaborov.junit.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.savagaborov.junit.helper.JunitTesting;

public class SquareTest {
	
	@Test
	public void testSquareMethod_SquareOfNumberFive() {
		JunitTesting test = new JunitTesting();
		assertEquals(25, test.square(5));
	}

}
