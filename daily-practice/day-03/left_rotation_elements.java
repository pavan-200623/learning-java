import java.util.Scanner;

public class left_rotation_elements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int size = scanner.nextInt();
		int[] numbers = new int[size];

		System.out.println("Enter " + size + " elements:");
		for (int index = 0; index < size; index++) {
			numbers[index] = scanner.nextInt();
		}

		System.out.print("Enter the number of left rotations: ");
		int rotations = scanner.nextInt();

		if (size > 0) {
			rotations = rotations % size;

			for (int rotation = 0; rotation < rotations; rotation++) {
				int firstElement = numbers[0];

				for (int index = 0; index < size - 1; index++) {
					numbers[index] = numbers[index + 1];
				}

				numbers[size - 1] = firstElement;
			}
		}

		System.out.print("Array after left rotation: ");
		for (int number : numbers) {
			System.out.print(number + " ");
		}

		scanner.close();
	}
}
