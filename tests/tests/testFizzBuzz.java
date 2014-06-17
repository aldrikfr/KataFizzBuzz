package tests;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fizzbuzz.GenericGame;
import fizzbuzz.rules.*;


public class testFizzBuzz {

	GenericGame game;
	
	@Test
	public void testGetAnswerWithDefaultRule() {
		assertGame(new String[] {"1"}, new int[] {1});
		assertGame(new String[] {"2"}, new int[] {2});
	}
	
	@Test
	public void testGetAnswerWithMany() {
		assertGame(new String[] {"1","2"}, new int[] {1,2});
	}

	
	@Test
	public void testGetAnswerWithFizzRule() {
		assertGame(new String[] {"Fizz","Fizz"}, new int[] {3,6});
	}	
	
	@Test
	public void testGetAnswerWithBuzzRule() {
		assertGame(new String[] {"Buzz","Buzz"}, new int[] {5,10});
	}
	
	
	@Test
	public void testGetAnswerWithFizz_BuzzRule() {
		assertGame(new String[] {"FizzBuzz"}, new int[] {15});
	}
	
	@Before
	public void setUp() throws Exception {
		ArrayList<GenericRule> rules = new ArrayList<>();
		rules.add(new ModuloRule(3, "Fizz"));
		rules.add(new ModuloRule(5, "Buzz"));
		rules.add(new DefaultRule());
		
		this.game = new GenericGame(rules);
	}
	
	@After
	public void tearDown() throws Exception {
		this.game = null;
	}
	
	
	
	private void assertGame(String expected[], int input[]) {
		
		String[] actuals = this.game.getAnswer(input);
		assertArrayEquals(expected, actuals);
	}	
	

}
