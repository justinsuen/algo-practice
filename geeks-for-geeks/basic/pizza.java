//pizza: http://www.practice.geeksforgeeks.org/problem-page.php?pid=1200

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int checkPizza (int[] arr1, int[] arr2) {
        int count=0;
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                if (arr1[i]==arr2[j]) {
                    count++;
                    break;
                }
            }
        }
    }
    
	public static void main (String[] args) {
		//code
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int i = 0;

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t>0) {
		    //read first array
		    for (i=0; i<10 ;i++) {
		        arr1[i] = sc.nextInt();
		    }
		
		    //read second array
		    for (i=0; i<10 ;i++) {
		        arr2[i] = sc.nextInt();
		    }
		    
		    //check pizza
		    System.out.println(checkPizza(arr1, arr2));
		    t--;
		}
		
		//print both arrays
		//System.out.println(Arrays.toString(arr1));
		//System.out.println(Arrays.toString(arr2));
	}
}