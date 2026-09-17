

import java.util.Scanner;

public class linear_search {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int size = scanner.nextInt();
		int[] numbers = new int[size];

		System.out.println("Enter " + size + " elements:");
		for (int index = 0; index < size; index++) {
			numbers[index] = scanner.nextInt();
		}

		System.out.print("Enter the value to search: ");
		int target = scanner.nextInt();

		int foundIndex = -1;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] == target) {
				foundIndex = index;
				break;
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
