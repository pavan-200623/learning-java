import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = fnre(arr);

        if (result == -1) {
            System.out.println("No non-repeating element found.");
        } else {
            System.out.println("First non-repeating element is: " + result);
        }
    }

    static int fnre(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean repeated = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                return arr[i];
            }
        }
        return -1;
    }
}
