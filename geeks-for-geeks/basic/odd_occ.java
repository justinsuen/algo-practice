// odd occurence in array: http://www.practice.geeksforgeeks.org/problem-page.php?pid=836

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int odd_occ (int[] arr, int n) {
        int res = 0;
        for (int i=0; i<n; i++) {
		        res = res ^ arr[i];
		}
		return res;
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
		    
		    System.out.println(odd_occ(arr,n));
		    t--;
		}
	}
}