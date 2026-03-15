
public class TestMaxMin {

	public static void main(String[] args) {
		
		int arr[] = {25, 10, 35, 5, 40, 5, 40};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("First Minimum Element: " + min);
        System.out.println("First Maximum Element: " + max);

		 
		 
		 
		 
		 
		 
		
	} // class ends here 
}