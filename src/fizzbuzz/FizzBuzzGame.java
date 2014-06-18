package fizzbuzz;

import java.util.ArrayList;

public class FizzBuzzGame {
	
	private ArrayList<String> answers;

	public String[] getAnswer(int[] numbers)
	{
		answers = new ArrayList<String>();
		
		for(int currentNumber : numbers) {
			answers.add(String.valueOf(currentNumber));
		}
		
		return this.getFormatedAnswers();
	}
	
	private String[] getFormatedAnswers() {	
		return answers.toArray(new String[answers.size()]); 
	}
}
