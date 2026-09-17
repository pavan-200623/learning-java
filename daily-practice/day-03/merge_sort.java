public class merge_sort {
	public static void mergeSort(int[] numbers, int left, int right) {
		if (left >= right) {
			return;
		}

		int middle = left + (right - left) / 2;
		mergeSort(numbers, left, middle);
		mergeSort(numbers, middle + 1, right);
		merge(numbers, left, middle, right);
	}

	public static void merge(int[] numbers, int left, int middle, int right) {
		int[] temporary = new int[right - left + 1];
		int firstIndex = left;
		int secondIndex = middle + 1;
		int temporaryIndex = 0;

		while (firstIndex <= middle && secondIndex <= right) {
			if (numbers[firstIndex] <= numbers[secondIndex]) {
				temporary[temporaryIndex++] = numbers[firstIndex++];
			} else {
				temporary[temporaryIndex++] = numbers[secondIndex++];
			}
		}

		while (firstIndex <= middle) {
			temporary[temporaryIndex++] = numbers[firstIndex++];
		}

		while (secondIndex <= right) {
			temporary[temporaryIndex++] = numbers[secondIndex++];
		}

		for (int index = 0; index < temporary.length; index++) {
			numbers[left + index] = temporary[index];
		}
	}

	public static void main(String[] args) {
		int[] numbers = {38, 27, 43, 3, 9, 82, 10};

		System.out.println("Before sorting:");
		printArray(numbers);

		mergeSort(numbers, 0, numbers.length - 1);

		System.out.println("After sorting:");
		printArray(numbers);
	}

	public static void printArray(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
    
}
