//max sum of subsequence: http://www.practice.geeksforgeeks.org/problem-page.php?pid=531

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int dpsol (int[] arr, int n) {
        if (n==1) {
            return arr[0];
        } else if (n==2) {
            return Math.max(arr[0], arr[1]);
        } else {
            arr[n-2] = Math.max(arr[n-1], arr[n-2]); 
            for (int i=n-3; i>=0; i--) {
                arr[i] = Math.max(arr[i]+arr[i+2], arr[i+1]);
            }
            //to see array
            //System.out.println(Arrays.toString(arr));
            return arr[0];
        }
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t>0) {
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    
		    for (int i=0; i<n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    
		    System.out.println(dpsol(arr, n));
		    t--;
		}
	}
}