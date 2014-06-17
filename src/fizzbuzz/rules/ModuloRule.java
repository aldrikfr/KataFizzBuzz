package fizzbuzz.rules;

public class ModuloRule implements GenericRule {
	
	int numberForModulo;
	String answerToUse;
	
	public ModuloRule(int number, String answer) {
		this.numberForModulo = number;
		this.answerToUse = answer;
		
	}
	
	
	/* (non-Javadoc)
	 * @see fizzbuzz.rules.GenericRule#apply(int)
	 */
	@Override
	public String apply(int number, String currentAnswer) {
        String answer = currentAnswer;
     
		if(checkRule(number)){
			answer = currentAnswer.concat(this.answerToUse);
		}
		
		return answer;
	}
	
	private boolean checkRule(int number)
	{
		return  checkNumberIsModuloOf(number, this.numberForModulo);			
	}

	private boolean checkNumberIsModuloOf(int number, int modulo) {
		return number % modulo  == 0;
	}
	
	
}
