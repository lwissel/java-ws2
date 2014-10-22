/** Exercise 5 ws 2
 *
 * Program to check a given sudoku solution whether it is valid
 *
 * the numbers 1-9 are only allowed to appear exactly once in each row, column
 * and 3x3 subblock matrix of the 9x9 main sudoku matrix
 *
 * @author  Lennart Wissel
 * @version 22.10.2014
 */
public class Ex5 {
  public static void main(String[] args) { 
    int[][] input = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
            { 4, 5, 6, 7, 8, 9, 1, 2, 3 }, { 7, 8, 9, 1, 2, 3, 4, 5, 6 },
            { 2, 3, 4, 5, 6, 7, 8, 9, 1 }, { 5, 6, 7, 8, 9, 1, 2, 3, 4 },
            { 8, 9, 1, 2, 3, 4, 5, 6, 7 }, { 3, 4, 5, 6, 7, 8, 9, 1, 2 },
            { 6, 7, 8, 9, 1, 2, 3, 4, 5 }, { 9, 1, 2, 3, 4, 5, 6, 7, 8 } };

    for(int row=0; row <9; row++){System.out.print(checkRow(input,row)+" ");}
  }

  /** method to check the rows to have each number only once
   * @param matrix is the sudoku input matrix, row selects which row to test
   * @param row is the row we are going to test
   * @return true if each only once
   */
  public static boolean checkRow(int[][] matrix, int row) {
    int[] a = new int[9];

    // count the occurences of the numbers 1-9 represented by array a
    for(int j = 0; j < matrix[row].length; j++) {
      switch (matrix[row][j]) {
        case 1: a[0]++; break;
        case 2: a[1]++; break;
        case 3: a[2]++; break;
        case 4: a[3]++; break;
        case 5: a[4]++; break;
        case 6: a[5]++; break;
        case 7: a[6]++; break;
        case 8: a[7]++; break;
        case 9: a[8]++; break;
      }
    }

    // check whether all values are == 1
    for(int j = 0; j < a.length; j++) {
      if (a[j] != 1) {
        return false;
      }
    }
      return true;
  }

  /** method to check the columns to have each number only once
   * @return true if each only once
   * @param matrix is the matrix we check the column of
   * @param col is the column we are checking
   */
//  public static boolean checkColumn(int[][] matrix, int col) {
//    return true;
//  }

  /** method to check the subblock matrices for the occurence of each number
   * @return true if each only once
   * @param matrix is the matrix we check the subsquares of
   * @param sq is the numbered square we check
   */
//  public static boolean checkSquare(int[][] matrix, int sq) {
//    return true;
//  }

  // method to obtain a 3x9 result array containing whether each row or
  // columns evaluates to true/false according to the sudoku excercise. The
  // last row contains the same information for the subsquares.
//  public static boolean[][] checkSudoku(int[][] matrix) {
//    return true;
//  }
}
