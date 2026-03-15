public class TestPrimeNumbersArray {

    public static void main(String[] args) {

        int arr[] = {2, 5, 8, 11, 14, 17, 20};

       
        
        for (int i = 0; i < arr.length; i++) {

            
            boolean isPrime = true;

            if (arr[i] <= 1) {
                isPrime = false;  // if lees than 1 
            }

            for (int j = 2; j <= arr[i]/ 2; j++) 
            {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;  // stop here 
                }
            }

            if (isPrime) {  
            	 System.out.println("Prime numbers in the array:"+arr[i] ); 
            }
        }
    }
}