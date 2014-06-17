package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fizzbuzz.rules.GenericRule;
import fizzbuzz.rules.ModuloRule;

public class TestModuloRule {

	private GenericRule rule;
	
	@Before
	public void setUp() throws Exception {
		this.rule = new ModuloRule(3,"Fizz");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testApplyWith3() {
		int input = 3;
		String expected = "Fizz";
		
		String result = this.rule.apply(input);
		
		assertEquals(expected,result);
	}
	
	@Test
	public void testApplyWith1() {
		int input = 1;
		String expected = "";
		
		String result = this.rule.apply(input);
		
		assertEquals(expected,result);
	}

}
