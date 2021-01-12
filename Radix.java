import java.util.*;
public class Radix{

  public static int nth(int n, int col) {
    n = n / ((int)Math.pow(10,col));
    return Math.abs(n % ((int)Math.pow(10,col)));
  }

  public static void main(String[] args) {
    // System.out.println(nth(123,1));
    // System.out.println(nth(-123,1));
    // System.out.println(nth(123,2));
    // System.out.println(nth(-123,2));
  }

}
