
import java.util.Scanner;

public class number_of_words_in_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim();

        int wordCount = input.isEmpty() ? 0 : input.split("\\s+").length;
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}
