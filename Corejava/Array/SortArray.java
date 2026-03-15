import java.util.Scanner;

public class SortArray {
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

        // ---------- ASCENDING ORDER ----------
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Ascending Order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // ---------- DESCENDING ORDER ----------
        // Reverse the sorted array
        System.out.println("\nDescending Order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}