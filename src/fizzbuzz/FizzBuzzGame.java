package fizzbuzz;

import java.util.ArrayList;

public class FizzBuzzGame {
	
	private ArrayList<String> answers;

	public String[] getAnswer(int[] numbers)
	{
		answers = new ArrayList<String>();
		
		for(int currentNumber : numbers) {
			String answer = "";
			
			answer = this.applyFizzRule(currentNumber);
		    answer = this.applyBuzzRule(currentNumber,answer);
		    answer = this.applyDefault(currentNumber, answer);
			
			
			answers.add(answer);
		}
		
		return this.getFormatedAnswers();
	}
	
	private String applyFizzRule(int number)
	{
		if(this.checkFizz(number))
			return "Fizz";
					
		return "";
	}
	
	private String applyBuzzRule(int number, String answer)
	{
		if(this.checkBuzz(number))
			return answer.concat("Buzz");
					
		return answer;
	}
	
	private String applyDefault(int number, String answer)
	{
		if( checkDefault(answer)){
			return this.numberToAnswer(number);				
		}
		return answer;
	}
	
	private boolean checkFizz(int number)
	{
		return number % 3 == 0;

	}
	
	private boolean checkBuzz(int number)
	{
		return number % 5 ==0;
	}
	
	private boolean checkDefault(String answer)
	{
	   return answer.contentEquals("");
	}
	
	private String[] getFormatedAnswers() {	
		return answers.toArray(new String[answers.size()]); 
	}
	
	private String numberToAnswer(int number) {
		return String.valueOf(number);
	}
}
