/** Excercise 3 of ws2
 *
 * Implementation of Erastothenes algorithm to find prime numbers up to a limit n
 *
 *
 * Algorithm:
 * numbers from 2 to n in a list, then start by stroking out all multiples of
 * that number in the list. The next non-stroked number is then the next prime
 * number. Now repeat to stroke multiples of that number until you reach a
 * prime with prime^2 > n because then all multiples are already stroked out
 * and the remaining numbers are prime.
 *
 * @author:  Lennart Wissel
 * @version: 20.10.2014
 */

public class Ex3 {
  public static void main(String[] args){

    boolean[] prime = sieve(14);

    // Print the prime numbers
    System.out.println();
    for (int b = 0; b < prime.length; b++) {
      if (prime[b]) {
        System.out.print(b + " ");
      }
    }
  }

  // main sieve method to pass the given test structure..
  public static boolean[] sieve(int input) {
    int n = 0; // avoid a null array
    if (input < 2) {
      System.out.println("Please call the program with a parameter of int n >= 2.");
      System.exit(0);
    } else {
      n = input;
    }

    // prime array representing all the numbers from 0 up to n
    // after the algorithm: true = prime, false  = not prime
    // default value is FALSE for every element
    boolean[] prime = new boolean[n]; // we start with 0;

    // set whole array to true except for 0 and 1
    for (int i = 2; i < prime.length; i++) { prime[i] = true; }
	
	// algorithm
	//
    // main loop to check for multiples of each next element
	// stop as soon as we would double check multiples (q*q > n).
    for (int q = 2; q*q <= n; q++) {
      // but only calculate if the number is not already multiple = set to false
      if (prime[q] == true) {
        setMultiplesToFalse(q,prime);
        System.out.println();
        for (boolean a: prime) { System.out.print(a + " "); }
      }
    }
    return prime;
  }

  // find multiples of number in boolean array and set element to false if the
  // corresponding index is multiple because then the number can't be prime
  // we start from m+1 wich is the next element.
  // returns array where multiples (equivalent to array index) of m are set to false
  public static boolean[] setMultiplesToFalse(int m, boolean[] array) {
    for (int i = m+1; i < array.length; i++) {
      if (i % m == 0) {
        array[i] = false;
      }
    }
    return array;
  }
}
