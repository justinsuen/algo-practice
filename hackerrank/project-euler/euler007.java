// https://www.hackerrank.com/contests/projecteuler/challenges/euler007

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] store = new int[T];
        
        int j, max = 0;
        for (int i=0; i<T; i++) {
            j = sc.nextInt();
            store[i] = j-1;
            if(j > max)
                max = j;
        }
        
        int[] primeChecker = new int[max];
        int[] primes = new int[max];
        
        primeChecker[0] = 2;
        primes[0] = 2;
        
        primes = findPrime(primeChecker, primes, 1, max);
        
        for (int i=0; i<T; i++) {
            System.out.println(primes[store[i]]);
        }
    }
    
    public static int[] findPrime(int[] primeChecker, int[] primes, int end, int size) {
        int i = 2;
        boolean cond;
        while (end < size) {
            i++;
            cond = true;
            
            for (int j=0; j<end; j++) {
                primeChecker[j]--;
                if (primeChecker[j] == 0) {
                    primeChecker[j] = primes[j];
                    cond = false;
                }
            }
            
            if (cond) {
                primeChecker[end] = i;
                primes[end] = i;
                end++;
            }
        }
        
        return primes;
    }
}