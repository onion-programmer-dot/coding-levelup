package coding.hackerrank.array.medium;


import java.util.Scanner;

public class NewYearChaos {
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
    
    private static void minimumBribes(int[] arr ){
    	int len = arr.length;
    	int bribeCount=0;
    	
    	for(int i=len-1; i >=0; --i){
    		
    		if(arr[i] != i+1){
    			
    			if(i-1 >= 0 && arr[i-1] == i+1){
    				bribeCount++;
    				swap(arr, i, i-1);
    				
    			}else if(i-2 >= 0 && arr[i-2] == i+1){
    				bribeCount = bribeCount+2;
    				swap(arr, i-2, i-1);
    				swap(arr, i-1, i);
    				
    			}else{
    				System.out.println("Too chaotic");
    				return;
    			}
    		}
    	}
    	System.out.println(bribeCount);
    }
    
    /**
     * Swap two element 
     * 
     * @param arr
     * @param num
     * @param num1
     */
    public static void swap(int[] arr, int num, int num1){
    	
    	int val = arr[num];
    	arr[num] =  arr[num1];
    	arr[num1] = val;
    }
}
