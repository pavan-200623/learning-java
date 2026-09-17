import java.util.Scanner;

public class bouble_sort {
	public static void bubbleSort(int[] numbers) {
		for (int pass = 0; pass < numbers.length - 1; pass++) {
			for (int index = 0; index < numbers.length - 1 - pass; index++) {
				if (numbers[index] > numbers[index + 1]) {
					int temporary = numbers[index];
					numbers[index] = numbers[index + 1];
					numbers[index + 1] = temporary;
				}
			}
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

		bubbleSort(numbers);

		System.out.println("Sorted array:");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();

		scanner.close();
	}
}
