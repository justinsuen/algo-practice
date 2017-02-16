// https://www.hackerrank.com/contests/projecteuler/challenges/euler004

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0; i<T; i++) {
            Long n = sc.nextLong();
            long curr_lar = 0;
            for(long k = 999; k>100; k--){
                for(long j = 999; j>100; j--){
                long mul = k*j;
                    if(is_palin(mul) && (mul>curr_lar) && (mul<n)){
                        curr_lar = mul;
                    }
                }
            }
            System.out.println(curr_lar);
        }
    }
    
    public static boolean is_palin(Long n) {
        String str = n.toString();
        int i1 = 0;
        int i2 = str.length() - 1;
        while (i2 > i1) {
           if (str.charAt(i1) != str.charAt(i2)) {
            return false;
           }
           i1++;
           i2--;
        }
        return true;
    }
}