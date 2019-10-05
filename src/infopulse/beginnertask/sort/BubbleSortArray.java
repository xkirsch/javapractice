//Array112
package infopulse.beginnertask.sort;

import java.util.Arrays;

import infopulse.beginnertask.arrays.ArraysHelper;

public class BubbleSortArray {
	public static void bubblesort(int[] arr) {
		boolean sort = true;  
        int temp;   
        int attempt = 0;
 
        while (sort) {
        	attempt++;
            sort = false;
            
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) { 
                    temp = arr[i];      
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sort = true;
                    }
                System.out.println("After checking "+(i+1)+"th element in the sorting cycle #"+attempt+" the array is: "+Arrays.toString(arr)+"\n");
                }
                
                
                }
	}
	public static void main(String[] args) {
	
	int n=6;
	int[] arr = new int[n];
	ArraysHelper.generate(arr,100);
	System.out.println(Arrays.toString(arr));
	bubblesort(arr);
}
}
