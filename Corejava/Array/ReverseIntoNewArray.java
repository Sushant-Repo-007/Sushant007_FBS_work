import java.util.Scanner;

public class ReverseIntoNewArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; //  object of array element here 
        
        int[] reversed = new int[n];  // reversed New array

        // Input elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse and store in new array
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - 1 - i];
        }

        // Display new reversed array
        System.out.println("Reversed Array (New Array):");
        for (int i = 0; i < n; i++) {
            System.out.print(reversed[i] + " ");
        }

        sc.close();
    }
}