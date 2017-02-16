// https://www.hackerrank.com/challenges/dynamic-array

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int lastAns = 0;
        
        // initialize seqList with N sequences
        for (int i=0; i<n; i++) {
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            seqList.add(tmp);
        }
        
        // start querying       
        for (int i=0; i<q; i++) {
            int q_num = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
            int index = ((x^lastAns)%n);
            ArrayList<Integer> seq = seqList.get(index);
            int size = 0;
            
            if (q_num==1) {
                seq.add(y);
            } else {
                size = seq.size();
                lastAns = seq.get(y%size);
                System.out.println(lastAns);
            }
        }
    }
}