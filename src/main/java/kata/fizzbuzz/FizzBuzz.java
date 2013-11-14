package kata.fizzbuzz;

public class FizzBuzz {
	public String[] getArrayAnswer(int lastNumber) {
		String[] answer = new String[lastNumber];
		if(lastNumber > 0) {
			for(int i = 0; i < lastNumber; i++) {
				answer[i] = Integer.toString(i+1);	
			}
		}
		return answer;
	}
}
