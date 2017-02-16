//k largest numbers: http://www.practice.geeksforgeeks.org/problem-page.php?pid=601

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void kLarge (int[] arr, int k, int n) {
        Arrays.sort(arr);
        int i=0;
        
        while (i<k) {
            System.out.print(arr[n-i-1] + " ");
            i++;
        }
        System.out.print("\n");
    }
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t>0) {
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] arr = new int[n];

		    for (int i=0; i<n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    kLarge(arr, k, n);
		    t--;
		}
	}
}