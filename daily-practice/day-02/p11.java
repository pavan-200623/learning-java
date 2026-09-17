public class p11 {
	public static void main(String[] args) {
		int[] numbers = {1, 1, 2, 2, 3, 4, 4};
		int uniqueCount = removeDuplicates(numbers);

		for (int i = 0; i < uniqueCount; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

	static int removeDuplicates(int[] numbers) {
		if (numbers.length == 0) {
			return 0;
		}

		int uniqueCount = 1;
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] != numbers[uniqueCount - 1]) {
				numbers[uniqueCount] = numbers[i];
				uniqueCount++;
			}
		}

		return uniqueCount;
	}
}
