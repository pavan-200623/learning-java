import java.util.Scanner;

public class Arranging_coins {
	public static int arrangeCoins(int n) {
		long left = 0;
		long right = n;

		while (left <= right) {
			long middle = left + (right - left) / 2;
			long coinsNeeded = middle * (middle + 1) / 2;

			if (coinsNeeded == n) {
				return (int) middle;
			} else if (coinsNeeded < n) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}

		return (int) right;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of coins: ");
		int n = scanner.nextInt();
		System.out.println("Complete rows: " + arrangeCoins(n));

		scanner.close();
	}
}
