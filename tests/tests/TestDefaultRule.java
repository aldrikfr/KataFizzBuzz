package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fizzbuzz.rules.DefaultRule;
import fizzbuzz.rules.GenericRule;
import fizzbuzz.rules.ModuloRule;

public class TestDefaultRule {

	private GenericRule rule;
	
	@Before
	public void setUp() throws Exception {
		this.rule = new DefaultRule();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testApplyWith1() {
		int input = 1;
		String expected = "1";
		
		String result = this.rule.apply(input, "");
		
		assertEquals(expected,result);
	}
}
