public class p9 {
	public static void main(String[] args) {
		int[] first = {1, 2, 3};
		int[] second = {4, 5, 6};

		int[] concatenated = new int[first.length + second.length];
		System.arraycopy(first, 0, concatenated, 0, first.length);
		System.arraycopy(second, 0, concatenated, first.length, second.length);

		for (int value : concatenated) {
			System.out.print(value + " ");
		}
	}
}
