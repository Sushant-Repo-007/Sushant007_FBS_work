import java.util.Scanner;

public class TestSearch {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int search;
        int index = -1; 

        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the number to search:");
        search = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}