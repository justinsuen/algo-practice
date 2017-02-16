// https://www.hackerrank.com/challenges/sparse-arrays

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Map<String,Integer> str_map=new HashMap<String,Integer>();
        
        for (int i=0; i<N; i++) {
            String str = sc.nextLine();
            Integer j = str_map.get(str);
            if (j==null) {
                j=1;
            } else {
                j++;
            }
            str_map.put(str, j);
        }
        
        int Q = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<Q; i++) {
            String q = sc.nextLine();
            Integer j = str_map.get(q);
            if (j==null) {
                System.out.println(0);
            } else {
                System.out.println(j);
            }
        }
   }
}