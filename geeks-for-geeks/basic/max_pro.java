//max product of two numbers: http://www.practice.geeksforgeeks.org/problem-page.php?pid=453

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int max_pro (int[] arr, int n) {
        int max1=arr[0], max2=1, tmp;
        for (int i=0; i<n; i++) {
            if (arr[i]>max1) {
                if (max1>max2) {
                    max2 = max1;
                }                
                max1 = arr[i];
            } else if (arr[i]>max2) {
                max2 = arr[i];
            }
        }
        return max1*max2;
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
		    
		    System.out.println(max_pro(arr,n));
		    t--;
		}
	}
}