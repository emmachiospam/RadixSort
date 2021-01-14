import java.util.*;
import java.io.*;

public class Radix{

  public static int nth(int n, int col) {
    n = n / ((int)Math.pow(10,col));
    return Math.abs(n % ((int)Math.pow(10,col)));
  }

  public static int length(int n) {
    int length;
    if(n == 0) {
      length = 1;
    }
    else {
      n = Math.abs(n);
      length = (int)Math.log10(n) + 1;
    }
    return length;
  }

  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets) {
    for(int i = 0; i < buckets.length; i++) {
      original.extend(buckets[i]);
    }
  }

  public static void main(String[] args) {
    System.out.println(length(0));
    System.out.println(length(15));
    System.out.println(length(-10));
    System.out.println(length(5112));
  }

}
