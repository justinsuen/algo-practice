//rotate array: http://www.practice.geeksforgeeks.org/problem-page.php?pid=360
//this solution is too slow...

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int[] rot_array (int[] arr, int n, int d) {
        int[] d_arr = new int[d];
        for (int i=0; i<d; i++) {
            d_arr[i] = arr[i];
        }
        
        for (int i=0; i<n-d; i++) {
            arr[i] = arr[i+d];
        }
        //System.out.println(Arrays.toString(arr));
        
        for (int i=n-d; i<n; i++) {
            arr[i] = d_arr[i-(n-d)];
        }
        
        return arr;
    }
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t>0) {
		    int n = sc.nextInt();
		    int d = sc.nextInt();
		    int[] arr = new int[n];
		    
		    for (int i=0; i<n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    
		    int[] rotated_array = rot_array(arr,n,d);
		    for (int i=0; i<n; i++) {
		        System.out.print(rotated_array[i] + " ");
		    }
		    System.out.print("\n");
		    t--;
		}
	}
}