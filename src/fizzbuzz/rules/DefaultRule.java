package fizzbuzz.rules;

public class DefaultRule implements GenericRule {

	@Override
	public String apply(int number, String currentAnswer) {
		if(currentAnswer.length() != 0 ) {
			return currentAnswer;
		}
		
		return String.valueOf(number);
		
	}

}
