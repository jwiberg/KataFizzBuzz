package kata.fizzbuzz;

public class FizzBuzz {
	public String[] getArrayAnswer(int lastNumber) {
		String[] answer = new String[lastNumber];
		for (int i = 1; i <= lastNumber; i++) {
			answer[i - 1] = "";
			if (isDividedBy3(i))
				answer[i - 1] += "Fizz";
			if (isDividedBy5(i))
				answer[i - 1] += "Buzz";
			if (answer[i - 1].length() == 0)
				answer[i - 1] += i;
		}
		return answer;
	}

	private boolean isDividedBy5(int i) {
		return i % 5 == 0;
	}

	private boolean isDividedBy3(int i) {
		return i % 3 == 0;
	}
}
