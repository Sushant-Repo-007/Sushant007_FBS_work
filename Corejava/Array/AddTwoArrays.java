import java.util.Scanner;

public class AddTwoArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of arrays
        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] result = new int[n];   // Third array

        // Input first array
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        // Add arrays element-wise
        for (int i = 0; i < n; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        // Display result array
        System.out.println("Sum of arrays:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}