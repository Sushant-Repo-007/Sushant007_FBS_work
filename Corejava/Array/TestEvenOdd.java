public class TestEvenOdd {

    public static void main(String[] args) {

        int arr[] = {12, 7, 9, 20, 15, 4, 11};
        
        

        System.out.println("Even Numbers:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("Odd Numbers:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}