package kata.fizzbuzz;

public class FizzBuzz {
	public String[] getArrayAnswer(int lastNumber) {
		String[] answer = new String[lastNumber];
		for (int i = 1; i <= lastNumber; i++) {
			if (isDividedBy3(i) && isDividedBy5(i)) {
				answer[i - 1] = "FizzBuzz";
			} else if (isDividedBy3(i)) {
				answer[i - 1] = "Fizz";
			} else if (isDividedBy5(i)) {
				answer[i - 1] = "Buzz";
			} else {
				answer[i - 1] = Integer.toString(i);
			}
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
