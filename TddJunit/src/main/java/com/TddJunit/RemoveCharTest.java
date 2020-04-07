package com.TddJunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveCharTest {

	RemoveChar removechar;
	@BeforeEach
	void setUp()
	{
		removechar	 = new RemoveChar();
	}
	
	@Test
	void testEmptyString()
	{
		assertEquals(removechar.remove(""),"");
	}
	
	@Test
	void test1CharA()
	{
		assertEquals(removechar.remove("ABCD"),"BCD");
	}
	
	@Test
	void test2CharAA()
	{
		
		assertEquals( removechar.remove("AACD"),"CD");
	}
	@Test
	void test1CharNotA()
	{

		assertEquals(removechar.remove("B"),"B");
	}
	
	@Test
	void test2CharsNotA()
	{
		assertEquals(removechar.remove("BC"),"BC");
	}
	
	@Test
	void testNCharsA()
	{

		assertEquals(removechar.remove("BACD"),"BCD");
	}
	
	@Test
	void testNCharsAA()
	{
		assertEquals( removechar.remove("AABAA"),"BAA");
	}
	
	@Test
	void testNCharsAAEnd()
	{	
		assertEquals(removechar.remove("BBAA"),"BBAA");
	}
	
	@Test
	void testNCharsAEnd()
	{

		assertEquals(removechar.remove("BCADS"),"BCADS");
	}


}