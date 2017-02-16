//missing number in array: http://www.practice.geeksforgeeks.org/problem-page.php?pid=414

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int getMiss(int sum, int n) {
        int miss = 0, total = (n*(n+1))/2;
        miss = total - sum;
        return miss;
    }
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t>0) {
		    int n = sc.nextInt();
		    int sum = 0;
		    
		    for (int i=0; i<n-1; i++) {
		        sum += sc.nextInt();
		    }
		    
		    System.out.println(getMiss(sum,n));
		    t--;
		}
	}
}