import java.io.*;
import java.util.*;

public class FindCommonElement {
  // O(n) time and O(1) space solution
  public static List<Integer> findCommonElement(int[] arrA, int[] arrB) {
    List<Integer> res = new ArrayList<Integer>();
    int bI = 0;

    for (int i = 0; i < arrA.length; i++) {
      while (arrA[i] > arrB[bI] && bI < arrA.length)
        bI++;

      if (arrA[i] == arrB[bI]) {
        res.add(arrA[i]);
      } else if (arrA[i] < arrB[bI]) {
        continue;
      }
    }

    return res;
  }

  public static void main(String[] args) {
    int[] arrA = {1,2,3,4,5,6};
    int[] arrB = {3,5,6,7,9,10};
    List<Integer> results = findCommonElement(arrA, arrB);
    System.out.println(results);
  }
}
