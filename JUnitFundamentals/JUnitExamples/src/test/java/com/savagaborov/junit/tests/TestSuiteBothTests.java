package com.savagaborov.junit.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CountATest.class, SquareTest.class })
public class TestSuiteBothTests {

}
