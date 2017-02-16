//sum of digits divisibility: http://www.practice.geeksforgeeks.org/problem-page.php?pid=674

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t>0) {
		    int n = sc.nextInt();
		    int sum = 0, tmp = n;
		    while (tmp > 0) {
		        sum = sum + tmp%10;
		        tmp = tmp/10;
		    }
		    if (n%sum == 0)
		        System.out.println(1);
		    else
		        System.out.println(0);
		    t--;
		}
	}
}