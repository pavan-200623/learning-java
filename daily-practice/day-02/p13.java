public class p13 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = scanner.nextLine();
		char repeatingChar = '\0';

		for (int i = 0; i < text.length(); i++) {
			for (int j = i + 1; j < text.length(); j++) {
				if (text.charAt(i) == text.charAt(j)) {
					repeatingChar = text.charAt(i);
					break;
				}
			}
			if (repeatingChar != '\0') {
				break;
			}
		}

		if (repeatingChar == '\0') {
			System.out.println("No repeating character found.");
		} else {
			System.out.println("First repeating character: " + repeatingChar);
		}

		scanner.close();
	}
}
