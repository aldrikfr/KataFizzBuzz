package fizzbuzz;

public class FizzBuzzGame {
	
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
		
	    if(checkFizz(number)){
			answer = answer.concat("Fizz");
		}
	    
	    if(checkBuzz(number)){
	    	answer = answer.concat("Buzz");
		} 
	    
		if(answer.length() == 0 ) {
			answer =  String.valueOf(number);
		}
		
		return answer;	
	}
	
	
	private boolean checkFizz(int number)
	{
		return  checkNumberIsModuloOf(number, 3);			
	}
	
	private boolean checkBuzz(int number)
	{
		return checkNumberIsModuloOf(number, 5);
	}
	
	private boolean checkNumberIsModuloOf(int number, int modulo) {
		return number % modulo  == 0;
	}
	
}
