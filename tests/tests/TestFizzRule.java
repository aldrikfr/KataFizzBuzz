package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import fizzbuzz.rules.FizzRule;

public class TestFizzRule {

	private FizzRule fizz;
	
	@Before
	public void setUp() throws Exception {
		this.fizz = new FizzRule();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testApplyWith3() {
		int input = 3;
		String expected = "Fizz";
		
		String result = this.fizz.apply(input);
		
		assertEquals(expected,result);
	}

}
