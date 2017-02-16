// https://www.hackerrank.com/contests/projecteuler/challenges/euler005

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Essentially, we want to get the number of prime factors. Lowest common multiple for 1 to N.
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0; i<T; i++) {
            int N = sc.nextInt();
            
            // make array of all numbers
            long[] input = new long[N];
            for (int j=0; j<N; j++) {
                input[j] = j + 1;
            }
            
            long result = 1;
            for (int k=0; k<input.length; k++) {
                result = lcm(result, input[k]);
            }
            System.out.println(result);
        }
    }
    
    public static long gcd(long a, long b) {
        while (b>0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    
    public static long lcm(long a, long b) {
        return a * (b / gcd(a,b));
    }
}