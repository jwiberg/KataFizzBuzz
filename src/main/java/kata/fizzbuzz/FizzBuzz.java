package kata.fizzbuzz;

public class FizzBuzz {
	public String[] getArrayAnswer(int lastNumber) {
		String[] answer = new String[lastNumber];
		for (int i = 1; i <= lastNumber; i++) {
			if (i % 3 == 0)
				answer[i - 1] = "Fizz";
			else
				answer[i - 1] = Integer.toString(i);
		}
		return answer;
	}
}
