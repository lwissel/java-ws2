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
    // use the first argument to define the limit n
    if (args.length == 0) {
      System.out.println("Please call the program with a parameter of int n.");
      System.out.println("Usage: java program n.");
      System.exit(0);
    } else {
      int n = Integer.parseInt(args[0]);
    }
  }
}
