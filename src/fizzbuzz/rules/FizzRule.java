package fizzbuzz.rules;

public class FizzRule {
	public String apply(int number) {
        String answer = "";
        
		if(checkFizz(number)){
			answer = "Fizz";
		}
		
		return answer;
	}
	
	private boolean checkFizz(int number)
	{
		return  checkNumberIsModuloOf(number, 3);			
	}

	private boolean checkNumberIsModuloOf(int number, int modulo) {
		return number % modulo  == 0;
	}
	
	
}
