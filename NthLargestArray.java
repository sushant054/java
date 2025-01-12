import java.util.Arrays;
import java.util.Scanner;

public class NthLargestArray {
    public static void main(String[] args) {
        int[] arr = {-8, 8, 10, 100, -50, 25, 75, -75, 90, 25, 8, 95, 96, 92, 91};
        int n = arr.length;

        System.out.println("array: " + Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int k = scanner.nextInt();
        if (k > n || k < 1) {
            System.out.println("Invalid value of n. It must be between 1 and " + n);
            return;
        }
        Arrays.sort(arr);

        System.out.println("The " + k + "th largest element is: " + arr[n - k]);
    }
}
