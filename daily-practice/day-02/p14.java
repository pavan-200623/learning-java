public class p14 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = scanner.nextLine();
		char firstNonRepeating = '\0';

		for (int i = 0; i < text.length(); i++) {
			int count = 0;

			for (int j = 0; j < text.length(); j++) {
				if (text.charAt(i) == text.charAt(j)) {
					count++;
				}
			}

			if (count == 1) {
				firstNonRepeating = text.charAt(i);
				break;
			}
		}

		if (firstNonRepeating == '\0') {
			System.out.println("No non-repeating character found.");
		} else {
			System.out.println("First non-repeating character: " + firstNonRepeating);
		}

		scanner.close();
	}
}
