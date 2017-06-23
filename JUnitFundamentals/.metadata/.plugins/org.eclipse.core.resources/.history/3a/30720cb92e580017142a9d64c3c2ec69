package com.savagaborov.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void testTruncateAInFirst2Positions() {
		
		StringHelper helper = new StringHelper();
		
		//String actuak = helper.truncateAInFirst2Positions("AACD");
		//String expected = "CD";
		
		//AACD => CD	ACD=> CD	CDEF=>CDEF	CDAA=>CDAA
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
		//expected, actual
	}
	
	//expected:<ABC[]> but was:<ABC[D]>
}
