import java.util.Scanner;

public class insertion_sort {
	public static void insertionSort(int[] numbers) {
		for (int index = 1; index < numbers.length; index++) {
			int currentNumber = numbers[index];
			int previousIndex = index - 1;

			while (previousIndex >= 0 && numbers[previousIndex] > currentNumber) {
				numbers[previousIndex + 1] = numbers[previousIndex];
				previousIndex--;
			}

			numbers[previousIndex + 1] = currentNumber;
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

		insertionSort(numbers);

		System.out.println("Sorted array:");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();

		scanner.close();
	}
}
