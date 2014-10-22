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
    String test[] = {"Java", "the", "array", "a", "softwareWorkshop", "to"};

    // print the array before the loop
    for (String s: test) { System.out.print(s + " "); }
    System.out.println();
    
    // call the algorithm
    bubbleSort(test);

    // print the array after the loop
    for (String s: test) { System.out.print(s + " "); }
    System.out.println();
  }

  // sorting algorithm
  public static String[] bubbleSort(String[] toSort) {
    if (toSort.length == 0) {
      return toSort;
    }
    int i = 0;
    while (!isSorted(toSort)) {
      checkAndSwap(i, toSort);
      i++;
      if (i == toSort.length-1) {
        i = 0;
      }
    }
    return toSort;
  }
  
  // check whether a given array is sorted (increasing string length)
  public static boolean isSorted(String[] s) {
    boolean res = false;

    for(int i = 0; i < s.length-1; i++) {
      if (s[i].length() <= s[i+1].length()) {
        res = true;
      }
      else {
        return false;
      }
    }
    return res;
  }

  // check string array at position pos and pos+1 and swap them if necessary
  // returns the array
  public static String[] checkAndSwap(int pos, String[] s) {
    String tmp;

    // bubble sort
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
