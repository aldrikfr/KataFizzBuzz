package fizzbuzz;

public class FizzBuzzGame {
	
	public String[] getAnswer(int input[])
	{
		int sizeOfAnswer = input.length;
		String[] answer = new String[sizeOfAnswer];
	
		for(int k = 0 ; k < sizeOfAnswer; k++) {
			
			if(input[k] == 3){
				
				answer[k] = "Fizz";
			}else{
			answer[k] = String.valueOf(input[k]);
			}
		}
		return answer;
	}
	
}
