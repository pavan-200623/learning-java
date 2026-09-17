import java.util.Scanner;

public class selection_sort {
	public static void selectionSort(int[] numbers) {
		for (int index = 0; index < numbers.length - 1; index++) {
			int smallestIndex = index;

			for (int nextIndex = index + 1; nextIndex < numbers.length; nextIndex++) {
				if (numbers[nextIndex] < numbers[smallestIndex]) {
					smallestIndex = nextIndex;
				}
			}

			int temporary = numbers[index];
			numbers[index] = numbers[smallestIndex];
			numbers[smallestIndex] = temporary;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int size = scanner.nextInt();
		int[] numbers = new int[size];

		System.out.println("Enter " + size + " elements:");
		for (int index = 0; index < size; index++) {
			numbers[index] = scanner.nextInt();
		}

		selectionSort(numbers);

		System.out.println("Sorted array:");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();

		scanner.close();
	}
}
