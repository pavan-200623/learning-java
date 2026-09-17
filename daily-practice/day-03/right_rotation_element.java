
import java.util.Scanner;

public class right_rotation_element {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int size = scanner.nextInt();
		int[] numbers = new int[size];

		System.out.println("Enter " + size + " elements:");
		for (int index = 0; index < size; index++) {
			numbers[index] = scanner.nextInt();
		}

		System.out.print("Enter the number of right rotations: ");
		int rotations = scanner.nextInt();

		if (size > 0) {
			rotations = rotations % size;

			for (int rotation = 0; rotation < rotations; rotation++) {
				int lastElement = numbers[size - 1];

				for (int index = size - 1; index > 0; index--) {
					numbers[index] = numbers[index - 1];
				}

				numbers[0] = lastElement;
			}
		}

		System.out.print("Array after right rotation: ");
		for (int number : numbers) {
			System.out.print(number + " ");
		}

		scanner.close();
	}
}
