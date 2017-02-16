//minimum difference pair: http://www.practice.geeksforgeeks.org/problem-page.php?pid=606

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int findMinDiff (int[] arr, int n) {
        //sort array
        Arrays.sort(arr);
        
        //initialize diff
        int diff = Integer.MAX_VALUE;
        
        for (int i=0; i<n-1; i++) {
            if (arr[i+1]-arr[i] < diff) {
                diff = arr[i+1]-arr[i];
            }
        }
        return diff;
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
		    System.out.println(findMinDiff(arr, n));
		    t--;
		}
	}
}