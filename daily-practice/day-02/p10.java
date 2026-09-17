public class p10 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			numbers[i] = sum;
		}

		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
}
