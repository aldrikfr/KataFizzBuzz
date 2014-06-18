package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fizzbuzz.FizzBuzzGame;

public class fizzBuzzTest {

	FizzBuzzGame game;
	
	@Before
	public void setUp() throws Exception {
	 this.game = new FizzBuzzGame();
	}

	@After
	public void tearDown() throws Exception {
		this.game = null;
	}

	@Test
	public void testGetAnswerWith1() {
		int input[] = {1};
		String[] expected = {"1"};
		
		String[] answer = this.game.getAnswer(input);
		assertArrayEquals(expected, answer);
		
	}
	@Test
	public void testGetAnswerWith2() {
		int input[] = {2};
		String[] expected = {"2"};
		
		String[] answer = this.game.getAnswer(input);
		assertArrayEquals(expected, answer);
		
	}
	
	@Test
	public void testGetAnswerWithMany() {
		int numbersFromUser[] = {1,2};
		String[] expected = {"1","2"};
		
		this.assertAnswer(expected, numbersFromUser);
		
		
	}
	
	private void assertAnswer(String[] expected, int numbersFromUser[])
	{
		
		String[] answer = this.game.getAnswer(numbersFromUser);
		assertArrayEquals(expected, answer);
	}

}
