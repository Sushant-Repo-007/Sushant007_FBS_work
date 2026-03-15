import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Size of first array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Size of second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt(); // passed here side too 

        int[] arr2 = new int[n2]; // object of array here 

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) 
        {
            arr2[i] = sc.nextInt();
        }

        // New array to hold merged result
        int[] merged = new int[n1 + n2];

        // Copy first array
        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }

        // Copy second array
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        // Display merged array
        System.out.println("Merged Array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }

        sc.close();
    }
}