// https://www.hackerrank.com/contests/projecteuler/challenges/euler003

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0; i<T; i++) {
            long N = sc.nextLong();
            long curr_largest = 1;
            while (N%2==0) {
                curr_largest = 2;
                N = N/2;
            }
            if (N==1) {
                System.out.println(curr_largest);
            }
            
            for (int j=3; j<=Math.sqrt(N); j+=2) {
                while (N%j==0) {
                    curr_largest = j;
                    N = N/j;
                }
            }
            if (N>2) {
                curr_largest = N;
            }
            System.out.println(curr_largest);
        }
    }
}