// https://www.hackerrank.com/contests/projecteuler/challenges/euler006

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0; i<T; i++) {
            long N = sc.nextLong();
            long sum_of_sq = N*(N+1)*(2*N+1)/6;
            long sq_of_sum = (N*(N+1)/2)*(N*(N+1)/2);
            System.out.println(sq_of_sum - sum_of_sq);
        } 
    }
}