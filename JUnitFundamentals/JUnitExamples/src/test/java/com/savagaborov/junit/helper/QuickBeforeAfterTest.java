package com.savagaborov.junit.helper;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.AfterClass;


public class QuickBeforeAfterTest {
	
	@BeforeClass
	public static void BeforeClass(){
		System.out.println("Before Class");
	}
	
	@Before
	public void setup(){
		System.out.println("Before");
	}

	@Test
	public void test1() {
		System.out.println("test1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 executed");
	}
	
	@After
	public void teardown(){
		System.out.println("After test");
	}
	
	@AfterClass
	public static void AfterClass(){
		System.out.println("After Class");
	}

}
