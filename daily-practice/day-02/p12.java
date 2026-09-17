public class p12 {
	public static void main(String[] args) {
		int[] numbers = {0, 1, 0, 3, 12};
		int position = 0;

		for (int number : numbers) {
			if (number != 0) {
				numbers[position] = number;
				position++;
			}
		}

		while (position < numbers.length) {
			numbers[position] = 0;
			position++;
		}

		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
}
