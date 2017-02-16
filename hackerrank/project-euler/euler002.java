// https://www.hackerrank.com/contests/projecteuler/challenges/euler002

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        long[] fib = new long[100];
        fib[0] = 1;
        fib[1] = 2;
        for (int i=2; i<100; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int i=0; i<t; i++) {
            long n = sc.nextLong();
            long sum = 0;
            int j = 0;
            while (fib[++j]<n) {
                if (fib[j]%2==0) {
                    sum += fib[j];
                }
            }
            System.out.println(sum);
        }
    }
}