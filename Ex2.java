/** Exercise 2 WS2
 * 
 * Counts occurrences of strings in a given string array
 *
 * @author	Lennart Wissel
 * @version 15.10.2014
 *
 */
 
 public class Ex2 {
	/**
	* counts the number of occurrences of a given string in a string array
	* @param s is the string to check
  * @param sArray is the array to check the string against
	* @return integer corresponding to number of occurrences
	*/
	public static int countOccurences(String s, String[] sArray){
		int n = 0;
		for (String i: sArray) {
			if (s.equals(i)) {
				n++;
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		String[] stringArray = {"the", "cat", "sat", "on", "the", "mat"};
		System.out.println(countOccurences("dog",stringArray));
		System.out.println(countOccurences("cat",stringArray));
		System.out.println(countOccurences("the",stringArray));
	}
 }
