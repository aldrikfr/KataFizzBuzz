package fizzbuzz;

import java.util.ArrayList;

import fizzbuzz.rules.GenericRule;

public class GenericGame {
	

	private ArrayList<GenericRule> rules; 
	
	public GenericGame(ArrayList<GenericRule> rules)
	{
		this.rules = rules;
	}
	
	
	public String[] getAnswer(int numbers[])
	{
		int sizeOfAnswer = numbers.length;
		String[] answers = new String[sizeOfAnswer];
	
		for(int k = 0 ; k < sizeOfAnswer; k++) {			
			int number = numbers[k];
			String answer;
			
			answer = applyRulesOn(number);
			
			answers[k] = answer;
		}
		
		return answers;
	}
	
	
	private String applyRulesOn(int number ){
		String answer = "";
		
		for(GenericRule eachRule : this.rules)
		{
			answer = eachRule.apply(number, answer);
		}

		
		
		return answer;	
	}

}
