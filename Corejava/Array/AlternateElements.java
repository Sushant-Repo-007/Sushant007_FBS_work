public class AlternateElements {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("Alternate elements in the array:");

        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}