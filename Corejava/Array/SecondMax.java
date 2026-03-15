import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Find max and second max
        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        // Output
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Second maximum not found.");
        } else {
            System.out.println("Second Maximum Element: " + secondMax);
        }

        sc.close();
    }
}