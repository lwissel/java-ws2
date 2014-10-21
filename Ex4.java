/** Excercise 4 ws 2
 *
 * Bubble sort swapping algorithm to sort a given string array
 *
 * loops through the string and swaps adjacent elements until it is sorted in
 * increasing string length
 *
 * @author  Lennart Wissel
 * @version 21.10.2014
 */

public class Ex4 {
  public static void main(String[] args) {

  }
  
  // check whether a given array is sorted (increasing string length)
  public static boolean isSorted(String[] s) {
    boolean res = false;
    for(int i = 0; i < s.length-1; i++) {
      if (s[i].length() <= s[i+1].length()) {
        res = true;
      }
    }
    return res;
  }

  // check string array at position pos and pos+1 and swap them if necessary
  // returns the array
  public static String[] checkAndSwap(int pos, String[] s) {
    String tmp;

    if (pos >= s.length) { return s; }
    if (s[pos].length() > s[pos+1].length()) {
      tmp = s[pos];
      s[pos] = s[pos+1];
      s[pos+1] = tmp;
      return s;
    } 
    else {
      return s;
    }
  }
}
