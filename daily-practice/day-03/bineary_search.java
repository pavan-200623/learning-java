

import java.util.Scanner;

public class bineary_search {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of sorted elements: ");
		int size = scanner.nextInt();
		int[] numbers = new int[size];

		System.out.println("Enter " + size + " elements in ascending order:");
		for (int index = 0; index < size; index++) {
			numbers[index] = scanner.nextInt();
		}

		System.out.print("Enter the value to search: ");
		int target = scanner.nextInt();

		int left = 0;
		int right = numbers.length - 1;
		int foundIndex = -1;

		while (left <= right) {
			int middle = left + (right - left) / 2;

			if (numbers[middle] == target) {
				foundIndex = middle;
				break;
			} else if (numbers[middle] < target) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}

		if (foundIndex == -1) {
			System.out.println("Value not found.");
		} else {
			System.out.println("Value found at index " + foundIndex + ".");
		}

		scanner.close();
	}
}
